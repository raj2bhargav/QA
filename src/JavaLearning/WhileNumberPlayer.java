package JavaLearning;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquareUptoLimit() {
		
		int square = 0;
		
		for(int i=1; i<=limit; i++) {
			square = i * i;
			System.out.println(square + " ");
		}
		
		
		//return square;
	}

	public void printCubesUptoLimit() {
		
		int cube = 0;
		
		for(int j=1; j<=limit; j++) {
			cube = j*j*j;
			System.out.println(cube + " ");
		}
		
	}

	public void printSquareMax() {
		
		int i = 1;
		
		while(i*i < 30) {
			System.out.println(i*i);
			i++;
		}
		
	}

	
	

}
