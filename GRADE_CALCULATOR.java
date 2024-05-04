package codsoft;
import java.util.Scanner;

public class GRADE_CALCULATOR {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // INPUT 

        // NO OF SUBJECT 
        System.out.print("\nEnter number of subject: ");
        int num_of_subjects=sc.nextInt();
        int[] marks=new int[num_of_subjects];

        // MARKS  OF SUBJECT 
        int Totalmarks=0;
        System.out.println("Total marks of each subject is 100.\nEnter your marks");
        for(int i=0;i<num_of_subjects;i++){
            System.out.print("SUBJECT "+(i+1)+" :");
            marks[i] =sc.nextInt();
            Totalmarks +=marks[i];
        }

        // PERCENTAGE 
        float percentage=(Totalmarks/num_of_subjects);

        // GRADING 
        String grade;
        if (percentage>=80) {
            grade="A+";  
        }
        else if (percentage>=70) {
            grade="A";
        }
        else if (percentage>=60) {
            grade="B";
        }
        else if (percentage>=50) {
            grade="C";
        }
        else if (percentage>=40) {
            grade="D";
        }
        else {
            grade="F";
        }

        // RESULT 
        System.out.println("\t\tRESULT");
        System.out.println("NO OF SUBJECTS: "+num_of_subjects);
        System.out.println("MARKS OF EACH SUBJECT: 100");
        System.out.println("TOTAL MARKS: "+(num_of_subjects*100));
        System.out.println("MARKS OBTAINED: "+Totalmarks);
        for(int i=0;i<num_of_subjects;i++){
            System.out.println("SUBJECT "+(i+1)+": "+marks[i]);
        }
        System.out.println("PERCENTAGE:"+percentage);
        System.out.println("GRADE:"+grade);
     }
}
