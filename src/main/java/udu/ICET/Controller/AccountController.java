package udu.ICET.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import udu.ICET.Model.Account;
import udu.ICET.Response.AccountResponse;
import udu.ICET.Service.AccountService;

@RestController
@CrossOrigin
@RequestMapping("auto_repair")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/SignUp")
    public AccountResponse signUp(@RequestBody Account account ){
        return accountService.addAccount(account);

    }

    @PostMapping("/Login")
    public AccountResponse login(@RequestBody Account account){
        return accountService.getLoginInfo(account);
    }

}
