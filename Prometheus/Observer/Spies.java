package Observer;

public class Spies implements Observer{
	String name;
	
	public Spies(String name) {
		this.name=name;
	}
	public void update(String messege) {
		if(messege.contains("розширення лав")) {
			System.out.println("You have the messege - \"" + messege+"\" from: "+name);
		}
		else if(messege.contains("способи відмивання")) {
			System.out.println("You have the messege - \"" + messege+"\" from: "+name);
		}
		else if(messege.contains("джерела надходження")) {
			System.out.println("You have the messege - \"" + messege+"\" from: "+name);
		}
	}
}
