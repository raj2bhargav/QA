package corejava;

import com.finals.test.AirIndia;

public class ClassA {

	public static void main(String[] args) {

		ClassB b = new ClassB();

		b.test();

		// TotalLinksCountConcept tl = new TotalLinksCountConcept();

		AirIndia ai = new AirIndia();
		ai.engineGuidelines();
		ai.safetyGuidelines();
		ai.bodyColor();

		AccessModifierConcept am = new AccessModifierConcept();
		am.firstMethod();
		
		am.fourthMethod();

	}

}
