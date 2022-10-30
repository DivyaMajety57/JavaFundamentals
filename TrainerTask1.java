package com.divya.assignment2;

public class TrainerTask1 {

    String name;
    String department;
    String email;
    int id;

    TrainerTask1(){
        name = null;
        department = null;
        email =null;
        id = 0;
    }

    //Constructor
    TrainerTask1(String trainer_name, String trainer_dept, String trainer_email, int trainer_id) {
        System.out.println("Constructor called");

        name = trainer_name;
        department = trainer_dept;
        email = trainer_email;
        id = trainer_id;
    }


    //Method to store TrainerTask1 information
    public void setTrainerInfo(String trainer_name, String trainer_dept, String trainer_email, int trainer_id){

        name = trainer_name;
        department = trainer_dept;
        email = trainer_email;
        id = trainer_id;
    }

    //Display Trainers information
    public void display(){

        System.out.println("-------------------------------------");
        System.out.println("TrainerTask1 Name : " + name);
        System.out.println("TrainerTask1 Department : " + department);
        System.out.println("TrainerTask1 Email : " + email);
        System.out.println("TrainerTask1 id : " + id);
        System.out.println("-------------------------------------");

    }


    public static void main(String[] args) {

        TrainerTask1 t1 = new TrainerTask1("Mukesh","Testing","mukesh@gmail.com",1);
        TrainerTask1 t2 = new TrainerTask1("Hitesh","Dev","Hitesh@gmail.com",2);
        TrainerTask1 t3 = new TrainerTask1("Mukesh","DevOps","mukesh@gmail.com",3);

        System.out.println("Trainers data using Constructor");

        t1.display();
        t2.display();
        t3.display();

        //Creating trainer info. using method
        TrainerTask1 t4 = new TrainerTask1();
        TrainerTask1 t5 = new TrainerTask1();
        TrainerTask1 t6 = new TrainerTask1();

        System.out.println("Trainers data using Method ");
        t4.setTrainerInfo("Mukesh","Testing","mukesh@gmail.com",1);
        t5.setTrainerInfo("Hitesh","Dev","Hitesh@gmail.com",2);
        t6.setTrainerInfo("Mukesh","DevOps","mukesh@gmail.com",3);

        t4.display();
        t5.display();
        t6.display();

    }

}
