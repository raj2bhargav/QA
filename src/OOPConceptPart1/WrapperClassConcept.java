package OOPConceptPart1;

public class WrapperClassConcept {
	
	public static void main(String[] args) {
		
		//Integer, Double and Boolean
		
		//String to Integer
		String x = "100";
		System.out.println(x+20);
		int x1 = Integer.parseInt(x);
		System.out.println(x1+20);
		
		System.out.println("-----------------");
		
		//String to Decimal
		String y = "12.55";
		System.out.println(y+10);
		double y1 = Double.parseDouble(y);
		System.out.println(y1+10);
		System.out.println("-------------------");
		
		//String to Boolean
		String z = "true";
		System.out.println(z);
		boolean z1 = Boolean.parseBoolean(z);
		System.out.println(z1);
		System.out.println("------------------");
		
		//Integer to String
		int m = 50;
		System.out.println(m+50);
		String m1 = String.valueOf(m);
		System.out.println(m1+50);
		
		
		
	}

}
