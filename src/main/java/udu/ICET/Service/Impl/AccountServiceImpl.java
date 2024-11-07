package udu.ICET.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import udu.ICET.Entity.AccountEntity;
import udu.ICET.Model.Account;
import udu.ICET.Repository.AccountRepository;
import udu.ICET.Response.AccountResponse;
import udu.ICET.Service.AccountService;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountResponse addAccount(Account account) {
        AccountResponse accountResponse=new AccountResponse();
        if(accountRepository.existsByEmail(account.getEmail())){
            accountResponse.setEmailValid(true);
        }
        if(accountRepository.existsByContactNumber(account.getContactNumber())){
            accountResponse.setContactNumberValid(true);
        }
        else if(accountResponse.isEmailValid()==false && accountResponse.isContactNumberValid()==false){
            accountRepository.save(new ModelMapper().map(account, AccountEntity.class));
        }
        return accountResponse;

    }

    @Override
    public AccountResponse getLoginInfo(Account account) {
        AccountResponse accountResponse=new AccountResponse();
        if(accountRepository.existsByEmail(account.getEmail())){
            accountRepository.getByEmail(account.getEmail());
            if(!(((AccountEntity)accountRepository.getByEmail(account.getEmail())).getPassword().equals(account.getPassword()))){
                accountResponse.setPasswordValid(true);
            }
        }
        else{
            accountResponse.setEmailValid(true);
        }
        return accountResponse;
    }
}
