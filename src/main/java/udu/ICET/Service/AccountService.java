package udu.ICET.Service;

import udu.ICET.Model.Account;
import udu.ICET.Response.AccountResponse;

public interface AccountService {
    AccountResponse addAccount(Account account);

    AccountResponse getLoginInfo(Account account);
}
