//creade class studentmarks print the grade taking user input and throw exception if its out of range
package com.stackroute.PE3;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String args[]){
        try {
            StudentMarks student= new StudentMarks();
            student.CheckRange();
        }
        //throw exception if its out of range
        catch(Exception e)
        {
            System.out.println("out of range");
        }


    }
    //use  stugrade array to store studentgrade
    public static void CheckRange() throws Exception
    {   int numberOfStudents;

        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of students");
        numberOfStudents=scan.nextInt();
        int stuGrade[]=new int[numberOfStudents];

        for(int i=0;i<numberOfStudents;i++)
        {
            System.out.println("enter the student grade" +(i+1) );
            stuGrade[i]=scan.nextInt();
            //check input is in range or not
            if(stuGrade[i]>0 && stuGrade[i]<100)
            {
                System.out.println("enter the student grade" +(i+1) +"bw d range");
            }
            else
            {
                throw new Exception("error");
            }

        }

    }
}
