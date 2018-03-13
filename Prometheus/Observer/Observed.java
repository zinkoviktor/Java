package Observer;

public interface Observed {
	void addSpy(Observer o);
	void removeSpy(Observer o);
	void notifySpies();
}
