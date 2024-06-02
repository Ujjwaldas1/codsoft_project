package codsoft_project;

import java.util.Scanner;

public class studentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Subjects : ");
        int totalSubject= sc.nextInt();
        if(totalSubject<=0){
            System.out.println("please! Enter a valid number of subject");
            return ;
        }
        int totalMarks=0;
        for(int i=0; i<totalSubject; i++){
            System.out.print("Enter the marks of subject "+(i+1)+ " (0-100) : ");

            int marks= sc.nextInt();
            if(marks<0||marks>100){
                System.out.println("please enter the valid marks between 0 and 100");
                i--;
            }else {
                totalMarks += marks;
            }
        }
        System.out.println("Total obtained marks : "+totalMarks);

        int percentage=totalMarks/totalSubject;
        System.out.println("Percentage : "+percentage+"%");

        if(percentage>90){
            System.out.println("Grade : O");
        }
        else if(percentage>80) {
            System.out.println("Grade : A+");
        }
        else if(percentage>70) {
            System.out.println("Grade : B");
        }
        else if(percentage>60) {
            System.out.println("Grade : A");
        }
        else if(percentage>50){
            System.out.println("Grade : B+");
        }
        else {
            System.out.println("Fail!");
        }
        sc.close();
    }
}
