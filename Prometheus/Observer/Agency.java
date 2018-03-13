package Observer;

import java.util.ArrayList;
import java.util.List;

public class Agency implements Observed {
	String messeges;
	 private List<Observer> observers = new ArrayList<Observer>();
	 
	 public void addM(String messeges) {
		 this.messeges=messeges;
		 notifySpies();
	 }
	 public void addSpy(Observer o) {
		observers.add(o);
	 }
	 public void removeSpy(Observer o) {
		observers.remove(o);
	 }
	 public void notifySpies() {
		for(Observer o: observers) {
			o.update(messeges);
		}
	 }
}
