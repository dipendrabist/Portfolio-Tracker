package np.edu.nast.portfoliotracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import np.edu.nast.portfoliotracker.entities.Purchase;
import np.edu.nast.portfoliotracker.entities.Sell;
import np.edu.nast.portfoliotracker.repository.PurchaseRepository;

@Controller
@RequestMapping("/share")
public class PurchaseSellController {
	@Autowired
	private PurchaseRepository purchaseRepository;
	@GetMapping("/purchase")
	public String getPurchaseForm(Model model){
		model.addAttribute("purchaseForm", new Purchase());
		//model.addAttribute("userInfo",profileRepository.findById(1L));
		return "buyShare";
	}
	@PostMapping("/purchase")
	public String formPostPurchase(Purchase purchase, BindingResult result, Model model) {
		System.out.println(purchase);
		purchaseRepository.save(purchase);
		return "buyShare";
	}	
	@GetMapping("/sell")
	public String getSellForm(Model model){
		model.addAttribute("sellForm", new Sell());
		//model.addAttribute("userInfo",profileRepository.findById(1L));
		return "sellShare";
	}
	@PostMapping("/sell")
	public String formPostSell(Sell sell, BindingResult result, Model model) {
		System.out.println(sell);
		//	purchaseRepository.save(purchase);
		return "sellShare";
	}

}
