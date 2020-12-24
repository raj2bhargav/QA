package practical;

public class Boxe {
	
	//Declaring instance variable height, width, depth.
	double heigth;
	double width;
	double depth;
	
	//Creating Boxe Constructor with parameter variable name same as instance variable names.
	Boxe(double heigth, double width, double depth) {
		this.heigth = heigth; //this.InstanceVariable = ParameterVariable
		this.width = width;
		this.depth = depth;
	}
	
	//Creating volume() method which calculates the volume.
	public double volume() {
		return heigth * width * depth;
	}
	
	
	

}
