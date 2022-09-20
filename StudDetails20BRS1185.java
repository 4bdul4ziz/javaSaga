import java.util.Scanner;
/*
 * Create a class named studDetails20BRS1185 which has a method named getMarks to collect the particulars of student marks in 5 subjects in an array. Create another class named StudentAverage which computes the average marks using the computeAverage method. This class also has a method named computeGPA which will compute the GPA of the student based on the marks secured. Assume that all the 5 courses are 3 credit courses. If student mark is >=95, give a score of 10. If the mark is >=90 and < 95, give 9. If the mark is >=80 and < 90, give 8. If the mark is >=70 and < 80 give 7. If the mark is >=60 and < 70 give 6. If the mark is >=50 and < 60 give 5. Else give the score as 0. Write a program to compute the student average mark and GPA and print the same.
 */
class StudentDetails
	{
		int[] marks = new int[100];
		int[] Score = new int[100];
		int[] credits = new int[100];
		static int Subjects=0;
		void getMarks()
		{
			Scanner S = new Scanner(System.in);
			for(int i = 0; i< 5; i++)
			{
				System.out.print("Enter Marks of Subject " + (i+1) +": ");
				marks[i]=S.nextInt();
				Score[i]=CalcScore(marks[i]);
				S.nextLine();
				System.out.print("Enter Credits of Subject " + (i+1)  +": ");
				credits[i]=S.nextInt();
				S.nextLine();
				Subjects++;
				System.out.println();
			}
			System.out.println();
		}

		private int CalcScore(int temp)
		{
			if(temp >= 95)
			{
				return 10;
			}
			else if (temp >= 90)
			{
				return 9;
			}
			else if (temp >= 80)
			{
				return 8;
			}
			else if (temp >= 70)
			{
				return 7;
			}
			else if (temp >= 60)
			{
				return 6;
			}
			else if (temp >= 50)
			{
				return 5;
			}
			else
			{
				return 0;
			}
		}

	}
	static class StudentAverage extends StudentDetails
	{
		int Average;
		int GPA;
		void computeAverage()
		{
			int Sum=0;
			for(int i=0;i<Subjects;i++)
			{
				Sum+=marks[i];
			}
			Average=Sum/Subjects;
			System.out.println("Average Marks are " + Average);
			System.out.println();
		}
		void computeGPA()
		{
			int Sum=0;
			int cSum=0;
			for(int i=0;i<Subjects;i++)
			{
				Sum+=Score[i]*credits[i];
				cSum+=credits[i];
			}
			GPA=Sum/cSum;
			System.out.println("GPA is " + GPA);
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		StudentAverage S = new StudentAverage();
		S.getMarks();
		S.computeAverage();
		S.computeGPA();
	}
