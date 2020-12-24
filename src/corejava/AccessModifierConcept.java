package corejava;

public class AccessModifierConcept {

	// Public, Private, Protected, Default

	public static void main(String[] args) {

		AccessModifierConcept amc = new AccessModifierConcept();
		amc.firstMethod();
		
		amc.thirdMethod();
		
		amc.fourthMethod();

	}

	// Default : Access method anywhere only in the same package
	void firstMethod() {
		System.out.println("First Method");
	}

	// Public : access across everywhere.
	public void secondMethod() {
		System.out.println("Second Method");
	}
	
	//Private : Cannot access outside the class.
	private void thirdMethod() {
		System.out.println("Third Method");
	}
	
	//Protected : Can access those in sub classes
	protected void fourthMethod() {
		System.out.println("Fourth Method");
	}
	

}
