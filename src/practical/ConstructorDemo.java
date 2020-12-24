package practical;

public class ConstructorDemo {
	
	double width;
	double heigth;
	double depth;
	
	//Constructor
	ConstructorDemo(double w, double h, double d) {
		width = w;
		heigth = h;
		depth = d;
	}
	
	double volume() {
		return width * heigth * depth;
	}
	

}
