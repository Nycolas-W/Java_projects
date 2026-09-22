package small_shopping_list_program;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String item;
		Double price;
		int quantity;
		Double total;
		
		System.out.println("What are you buying?");
		item = scanner.nextLine();
		
		System.out.println("How much is it?");
		price = scanner.nextDouble();
		
		System.out.println("How many are you "+item+" buying");
		quantity = scanner.nextInt();
		
		total = price * quantity;
		System.out.println("the "+item+" is going to be "+total);
		
		scanner.close();
		}
	}