package np.edu.nast.portfoliotracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accounts")
public class BankAccountController {
	@GetMapping("/myaccounts")
	private String bankAccounts(){
		return "myAccounts";
	}
	@GetMapping("/addaccount")
	private String addBankAccount(){
		return "addDEMAT";
	}
	@GetMapping("/loadfund")
	private String loadFund(){
		return "loadFund";
	}
}
