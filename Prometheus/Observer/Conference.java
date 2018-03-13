package Observer;

public class Conference {
	public static void main(String[] args) {
	Agency aa = new Agency();
	Observer newGe = new Spies("Gerodot");
	Observer newPe = new Spies("Petro");
	Observer newTa = new Spies("Taras");
	Observer newOl = new Spies("Oleg");
	Observer newVi = new Spies("Victor");
	
	aa.addSpy(newGe);
	aa.addSpy(newPe);
	aa.addSpy(newTa);
	aa.addSpy(newOl);
	aa.addSpy(newVi);
	
	aa.addM("Hello");
	aa.addM("розширення лав");
	aa.addM("Ми провели три варінти та визначили способи відмивання грошей");
	aa.removeSpy(newVi);
	aa.addM("казна основа джерела надходження");
	aa.addM("Hello I am from Sea");	
	}
}
