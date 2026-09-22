package Calculate_students_average;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		var total = 0;
		int[] semester = new int[3];
		for(int i=0; i<semester.length; i++) {
			semester[i] = scanner.nextInt();
			total += semester[i];
		}
		int average = total/semester.length;
		System.out.println(average);
	}

}
