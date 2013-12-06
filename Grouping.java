import java.util.Scanner;
import java.util.Random;
import java.io.*;


public class Grouping {

	String[] students;
	String answer = "";

	public static void main(String[] args) throws IOException{
		System.out.println("Enter 1 to choose a random student.");
		System.out.println("Enter 2 to create a random group of students.");
		Scanner start = new Scanner(System.in);
		int answer = start.nextInt();
		File file = new File("class.csv");
		Scanner scan = new Scanner(file);
		String[] students = scan.nextLine().split(",");
		Random r = new Random();
		shuffle(students, r);

		if (answer == 1) {
			System.out.println(students[0]);
		}
		if (answer == 2) {
			System.out.println("How many students would you like per group?");
			int b = start.nextInt();
			int name = 0;

			for (int i=0; i<students.length; i++) {
				
				for (int x=0; x<b; x++) {
					System.out.print(students[name] + "  ");
					name++;

					if (name == students.length) {
						System.exit(1);
					}
				}

				System.out.println();
				System.out.println();
			}

		}
	}
	public static void shuffle(String[] students, Random r){

		Random random = new Random();
		for (int i = students.length - 1; i>0; i--) {
			String a = students[i];
			int temp = random.nextInt(i);
			students[i] = students[temp];
			students[temp] = a;			
		}


	}

	

	

}