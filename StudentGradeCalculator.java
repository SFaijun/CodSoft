import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to StudentGradeCalculator");

        System.out.print("Enter the number of Subjects : ");

        int numberOfSubjects=sc.nextInt();
        double marks[]=new double[numberOfSubjects];
        double sum=0;
        // getting input from user and calculating total marks
        for(int i=0;i<numberOfSubjects;i++){
            System.out.print("Enter the mark for subject "+ (i+1) + ":");
            marks[i]=sc.nextInt();
            sum += marks[i];
        }
       //Calculating average percentage
       double average=sum / numberOfSubjects;

       //assigning the grade
       char Grade;
       if (average >= 90) {
        Grade='A';  
        } else if (average >= 80) {
        Grade='B'; 
        } else if (average >= 70) {
        Grade='C'; 
        } else if (average >= 60) {
         Grade='D'; 
        }else {
        Grade='E'; 
        }
        //Displaying the results
        System.out.println("The total marks obtained is : " +sum);
        System.out.println("The Average is : " +average);
        System.out.println("The obtained grade is : " + Grade);
        sc.close();   
 }
 
}
    

