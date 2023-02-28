package CoreJavaDemo;
import java.util.*;

public class QuizProgram {
	public static void main(String[] args) {
		System.out.println("Who is the founder of Blue Origin?");
		System.out.println("1. Bill Gates\n2. Tim Cook\n3. Nadella\n4. Jeff Bezos\n");
		while(true) {
			System.out.println("Enter your option :");
			int option;
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			
			switch(option)
			{
			case 1: System.out.println("Wrong Answer Try Again!");
			break;
			case 2: System.out.println("Wrong Answer Try Again!");
			break;
			case 3: System.out.println("Wrong Answer Try Again!");
			break;
			case 4: System.out.println("Right Answer!");
					System.exit(0);
			break;
			default: System.out.println("Choose Right option");
			}
		}
	}
}
