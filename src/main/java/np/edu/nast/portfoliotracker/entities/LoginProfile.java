package np.edu.nast.portfoliotracker.entities;

public class LoginProfile {

	private Login login;
	//relationship
	//OneToMany
	//ManyToOne
	//ManyToMany
	
	private Profile profile;
	
	public LoginProfile() {
		// TODO Auto-generated constructor stub
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "LoginProfile [login=" + login + ", profile=" + profile + "]";
	}
	
}
