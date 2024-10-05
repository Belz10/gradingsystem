package gradingsystem;
import java.util.Scanner;

public class Gradesystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int numStudents=5;
		int totalgrades=0;
		for(int i=1; i<=numStudents;i++) {
			System.out.print("Enter the grade for student" + i +":");
			int grade=input.nextInt();
			totalgrades +=grade;
			}
		double average=(double)totalgrades/numStudents;
		System.out.println("the average grade is:"+ average);
		
			if(average >=90) {
				System.out.println("grade: A");
			}else if(average >=80) {
				System.out.println("grade:b");
			}else if(average>=70) {
				System.out.println("grade:c");
			}else if (average>=60) {
				System.out.println("grade:d");
			}else if(average >=50);
						}
	
}


	}

}
