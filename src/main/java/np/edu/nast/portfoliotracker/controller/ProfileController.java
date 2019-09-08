package np.edu.nast.portfoliotracker.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import np.edu.nast.portfoliotracker.entities.Login;
import np.edu.nast.portfoliotracker.entities.Profile;
import np.edu.nast.portfoliotracker.repository.LoginRepository;
import np.edu.nast.portfoliotracker.repository.ProfileRepository;

@Controller
@RequestMapping("/User")
public class ProfileController {
	@Autowired
	private ProfileRepository profileRepository;
	@Autowired
	private LoginRepository loginRepository;
	@GetMapping("/login")
	public String index() {
		return "login";
	}
	@GetMapping("/signup")
	public String getSignUpForm(Model model){
		model.addAttribute("signUpForm", new Profile());
		//model.addAttribute("userInfo",profileRepository.findAll());	
		return "signup";
	}
	@PostMapping("/signup")
	public String formPost(Profile profile, BindingResult result, Model model) {
		System.out.println(profile);
		profileRepository.save(profile);
		//model.addAttribute("success", "Name " + profile.getFullName()+ " registered successfully");
		//model.addAttribute("signUpForm", new Profile());
		model.addAttribute("userInfo",profileRepository.findAll());	
		return "home";
	}
	
	//for update
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Profile profile = profileRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid student Id:" + id));
       Login login=new Login();
        model.addAttribute("profileForm", profile);
//        model.addAttribute("profileForm", login);
        return "profile";
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable("id") long id, @Valid Profile profile, BindingResult result,
        Model model) {
        if (result.hasErrors()) {
            profile.setProfileId(id);
            return "profile";
        }

        profileRepository.save(profile);
     //   model.addAttribute("", profileRepository.findAll());
        return "home";
    }

	
	
	
	
	
	
	@GetMapping("/changepassword")
	public String getChangePasswordForm() {
		return "changePassword";
	}
	
}
