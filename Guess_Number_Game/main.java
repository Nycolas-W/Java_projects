package Guess_Number_Game;
import java.util.Scanner;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(1,4);
		int i = 0;
		/*  Using if
		 * if (num == i){
			System.out.println("correct!");
		} else {
			System.out.println("false");
		}
		*/
		
		while (i != num) {
			 i = scanner.nextInt();
			System.out.println("Wrong number, try again \n");
		}
		System.out.println("The answer is "+num);
		scanner.close();
	}

}
