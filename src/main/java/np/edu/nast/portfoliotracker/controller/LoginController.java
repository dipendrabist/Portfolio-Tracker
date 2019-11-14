package np.edu.nast.portfoliotracker.controller;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import np.edu.nast.portfoliotracker.entities.Purchase;
import np.edu.nast.portfoliotracker.entities.Sell;
import np.edu.nast.portfoliotracker.entities.User;
import np.edu.nast.portfoliotracker.repository.PurchaseRepository;
import np.edu.nast.portfoliotracker.repository.SellRepository;
import np.edu.nast.portfoliotracker.repository.UserRepository;
import np.edu.nast.portfoliotracker.service.UserService;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;
@RequestMapping
@Controller
public class LoginController {
	@Autowired
	private PurchaseRepository purRepo;
	
	
	@Autowired
	private SellRepository sellRepo;
	@Autowired
	private UserService userService;

	@Autowired
	UserRepository userRepository;

	@GetMapping(value={"/","/login"})
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("login");
	
		return modelAndView;
		
	}


	@GetMapping("/access-denied")
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();

		User userCurrent = userRepository.findByEmail(user.getName());

		model.addObject("msg", "Hi " + userCurrent.getName()
		+ ", you do not have permission to access this page!");

		model.setViewName("access-denied");
		return model;
	}

	@GetMapping("/registration")
	public ModelAndView registration(){
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("signup");
		return modelAndView;
	}

	@PostMapping("/registration")
	public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists != null) {
			bindingResult
			.rejectValue("email", "error.user",
					"There is already a user registered with the email provided");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("signup");
		} else {
			userService.saveAdmin(user);
			modelAndView.addObject("successMessage", "User has been registered successfully");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("signup");

		}
		return modelAndView;
	}
	

	@GetMapping("/admin/registrationADMIN")
	public ModelAndView registrationADMIN(){
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("admin/registrationADMIN");
		return modelAndView;
	}

	@PostMapping("/admin/registrationADMIN")
	public ModelAndView createNewAdmin(@Valid User user, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists != null) {
			bindingResult
			.rejectValue("email", "error.user",
					"There is already a user registered with the email provided");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("admin/registrationADMIN");
		} else {
			userService.saveAdmin(user);
			modelAndView.addObject("successMessage", "User has been registered successfully");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("admin/registrationADMIN");

		}
		return modelAndView;
	}

	@GetMapping("/home")
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("userName", "" + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
		modelAndView.addObject("userId",""+user.getId());
		
	 List<Purchase> pur = (List<Purchase>) purRepo.findAll();
	 modelAndView.addObject("pur",pur);
		 
		List<Sell> sell=(List<Sell>) sellRepo.findAll();
		modelAndView.addObject("sell",sell);
		modelAndView.setViewName("home");
		return modelAndView;
	}
}