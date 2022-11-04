package com.divya.assignment2;

import java.util.Scanner;

public class StudentInfoTask3_Ver1 {

     String stuName;
     String email;
     long phoneNumber;
     String address;
     String status;


    //Default Constructor
    StudentInfoTask3_Ver1() {
        stuName = null;
        email = null;
        phoneNumber = 0;
        address = null;
        status = null;
    }

    //Parameterized Constructor
    StudentInfoTask3_Ver1(String sName, String email, long num, String address, String status) {
        stuName = sName;
        this.email = email;
        phoneNumber = num;
        this.address = address;
        this.status = status;
    }


    //Store Student info
    public StudentInfoTask3_Ver1[] storeStudentInfo(Scanner sc) {

        int count = 0;

        System.out.println("Enter no. of students : ");

        count = sc.nextInt();

        //Array initialization
        StudentInfoTask3_Ver1[] studentInfoArray = new StudentInfoTask3_Ver1[count];

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

            StudentInfoTask3_Ver1 stuInfo = new StudentInfoTask3_Ver1(stuName, email, phoneNumber, address, status);

            studentInfoArray[i] = stuInfo;
        }


        return studentInfoArray;

    }


    //Fetch Student Info
    private void fetchStudentInfo(StudentInfoTask3_Ver1[] studentInfo, int studentId) {

        for (int i=0; i<studentInfo.length; i++) {

           if(studentId == i+1)
               System.out.println(studentInfo[i].stuName+" , "+studentInfo[i].email+" , "+studentInfo[i].phoneNumber+" , "+studentInfo[i].address+ " , "+studentInfo[i].status);

        }

    }

    public static void main(String[] args) {


        int studentId = 0;

        Scanner sc = new Scanner(System.in);

        //Create StudentInfoTask3 object
        StudentInfoTask3_Ver1 stuInfo = new StudentInfoTask3_Ver1();

        //Storing
        StudentInfoTask3_Ver1[] studentInfoArray = stuInfo.storeStudentInfo(sc);

        //Display
        for (StudentInfoTask3_Ver1 studentInfo : studentInfoArray) {
            System.out.println(studentInfo.stuName+" , "+studentInfo.email+" , "+studentInfo.phoneNumber+" , "+studentInfo.address+" , "+studentInfo.status);
        }

       System.out.println("Which student details are you looking for : ");
       studentId = sc.nextInt();

        //Fetch
        stuInfo.fetchStudentInfo(studentInfoArray, studentId);
       sc.close();

    }
}





