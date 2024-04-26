import java.util.Scanner;
public class Grade 
{
public static void main(String[] args) 
{
		int marksobtained,passingmarks;
		char grade;
		passingmarks = 35 ;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter marks scored by you :" );
		marksobtained=sn.nextInt();
		if(marksobtained>= passingmarks)
		{
			if(marksobtained>90)
				grade = 'A';
			else if (marksobtained > 75)
				grade = 'B' ;
			else if (marksobtained > 60)
				grade = 'c';
			else
				grade = 'd';
			System.out.println("you passed the exam and your grade is "+grade);
		}
		else
		{
			grade = 'F';
			System.out.println("you failed the exam and your grade is "+ grade);
		}
	}
}
