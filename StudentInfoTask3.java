package com.divya.assignment2;

import java.util.Scanner;

public class StudentInfoTask3 {

     String stuName;
     String email;
     long phoneNumber;
     String address;
     String status;


    //Default Constructor
    StudentInfoTask3() {
        stuName = null;
        email = null;
        phoneNumber = 0;
        address = null;
        status = null;
    }

    //Parameterized Constructor
    StudentInfoTask3(String sName, String email, long num, String address, String status) {
        stuName = sName;
        this.email = email;
        phoneNumber = num;
        this.address = address;
        this.status = status;
    }


    //Store Student info
    public StudentInfoTask3[] storeStudentInfo(Scanner sc) {

        int count = 0;

        System.out.println("Enter no. of students : ");

        count = sc.nextInt();

        //Array initialization
        StudentInfoTask3[] studentInfoArray = new StudentInfoTask3[count];

        for (int i = 0; i < count; i++) {

            System.out.println("-----------------------------------");
            System.out.println("Enter Student Name :");
            stuName = sc.next();

            System.out.println("Enter Student email :");
            email = sc.next();

            System.out.println("Enter Student Phone Number :");
            phoneNumber = sc.nextLong();

            System.out.println("Enter Student Address :");
            address = sc.next();

            System.out.println("Enter Student Status :");
            status = sc.next();

            StudentInfoTask3 stuInfo = new StudentInfoTask3(stuName, email, phoneNumber, address, status);

            studentInfoArray[i] = stuInfo;
        }


        return studentInfoArray;

    }


    //Fetch Student Info
    private void fetchStudentInfo(StudentInfoTask3[] studentInfo, int studentId) {

        for (int i=0; i<studentInfo.length; i++) {

           if(studentId == i+1)
               System.out.println(studentInfo[i].stuName+" , "+studentInfo[i].email+" , "+studentInfo[i].phoneNumber+" , "+studentInfo[i].address+ " , "+studentInfo[i].status);

        }

    }

    public static void main(String[] args) {


        int studentId = 0;

        Scanner sc = new Scanner(System.in);

        //Create StudentInfoTask3_Complex object
        StudentInfoTask3 stuInfo = new StudentInfoTask3();

        //Storing
        StudentInfoTask3[] studentInfoArray = stuInfo.storeStudentInfo(sc);

        //Display
        for (StudentInfoTask3 studentInfo : studentInfoArray) {
            System.out.println(studentInfo.stuName+" , "+studentInfo.email+" , "+studentInfo.phoneNumber+" , "+studentInfo.address+" , "+studentInfo.status);
        }


       //Fetch
       System.out.println("Which student details are you looking for : ");
       studentId = sc.nextInt();
       System.out.println(studentInfoArray[studentId-1].stuName+" , "+studentInfoArray[studentId-1].email+" , "+studentInfoArray[studentId-1].phoneNumber+" , "+studentInfoArray[studentId-1].address+ " , "+studentInfoArray[studentId-1].status);

       sc.close();

    }
}





