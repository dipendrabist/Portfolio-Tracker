package np.edu.nast.portfoliotracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import np.edu.nast.portfoliotracker.entities.User;
import np.edu.nast.portfoliotracker.repository.UserRepository;

@Controller
@RequestMapping
public class HomeController {

	@Autowired
	UserRepository userRepository;
	@GetMapping("/changePassword/{id}")
	public String showChangePasswordForm(@PathVariable("id") Integer id, Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "changePassword";
	}
	@PostMapping("/changePassword/{id}")
	public String updateUser(@PathVariable("id") Integer id,  User user, 
	  BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        user.setId(id);
	        return "changePassword";
	    }
	         
	    userRepository.save(user);
	    model.addAttribute("users", userRepository.findAll());
	    return "/";
	}
}
