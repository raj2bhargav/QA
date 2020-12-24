package corejava;

public class StaticVariables {
	
	String name; //Instance Variable
	String address;
	static String city = "Toronto"; //Class Variable
	
	static int i = 0;
	
	StaticVariables(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
		
	}
	
	public void getAddress() {
		System.out.println(address + " " + city);
	}
	
	
	
	public static void getCity() {
		System.out.println(city);
	}
	

	public static void main(String[] args) {
		
		StaticVariables obj = new StaticVariables("Raj", "30 Denton Avenue");
		StaticVariables obj1 = new StaticVariables("Satyam", "1827-30 Denton Avenue");
		obj.getAddress();
		obj1.getAddress();
		
		getCity();
		
	}

}
