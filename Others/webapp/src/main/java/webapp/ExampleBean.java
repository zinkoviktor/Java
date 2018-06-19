package webapp;

//import javax.enterprise.context.ApplicationScoped;
//import javax.enterprise.context.RequestScoped;
import java.io.Serializable; 	
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named("exampleBean")
@SessionScoped
public class ExampleBean implements Serializable {
	
	private boolean logged;
	private String login;
	private String password;
	
	public boolean isLogged(){
		return logged;
	}
	public boolean setLogged(boolean logged) {
		return this.logged = logged;
	}
	
	
	public void doLogin() {
		logged = true;		
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setLogin(String login) {
		this.login = login;
	}
}
