
/**
 * @author nfan
 *
 */
public class HelloUser {
	private String name;
	
	public HelloUser(String userName){
		this.name = userName;
	}
	
	public void greetUser(){
		System.out.println("Hello " + this.name + "!");
	}
}
