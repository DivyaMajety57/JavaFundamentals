package com.divya.assignment2;

import java.util.Scanner;

public class StudentInfoTask3 {

     String stuName;
     String email;
     long phoneNumber;
     String address;
     String status;

   static Scanner sc = new Scanner(System.in);

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
    public StudentInfoTask3[] storeStudentInfo() {

        int count = 0;

        System.out.println("Enter no. of students : ");

        count = sc.nextInt();

        //Array initialization
        StudentInfoTask3[] studentInfoArray = new StudentInfoTask3[count];

        for (int i = 0; i < studentInfoArray.length; i++) {

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
    private static void fetchStudentInfo(StudentInfoTask3[] studentInfo, int studentId) {

        for (int i=0; i<studentInfo.length; i++) {

           if(studentId == i+1)
               System.out.println(studentInfo[i].stuName+" , "+studentInfo[i].email+" , "+studentInfo[i].phoneNumber+" , "+studentInfo[i].address+ " , "+studentInfo[i].status);


        }

    }

    public static void main(String[] args) {


        int studentId = 0;

        //Create StudentInfoTask3 object
        StudentInfoTask3 stuInfo = new StudentInfoTask3();

        //Storing
        StudentInfoTask3[] studentInfoArray = stuInfo.storeStudentInfo();

        //Display
        for (StudentInfoTask3 studentInfo : studentInfoArray) {
            System.out.println(studentInfo.stuName+" , "+studentInfo.email+" , "+studentInfo.phoneNumber+" , "+studentInfo.address+" , "+studentInfo.status);
        }


       System.out.println("Which student details are you looking for : ");
       studentId = sc.nextInt();

        //Fetch
       fetchStudentInfo(studentInfoArray, studentId);
       sc.close();

    }
}





