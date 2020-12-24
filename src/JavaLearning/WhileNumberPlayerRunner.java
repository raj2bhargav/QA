package JavaLearning;

public class WhileNumberPlayerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WhileNumberPlayer player = new WhileNumberPlayer(30);
		
		player.printSquareUptoLimit();
		
		//System.out.println(player.printSquareUptoLimit());
		//printSquareUptoLimit = player.printSquareUptoLimit();
		//System.out.println("Squares = " + player.printSquareUptoLimit());
		System.out.println("----------------------");
		player.printCubesUptoLimit();
		System.out.println("-------------");
		
		player.printSquareMax();

	}

}
