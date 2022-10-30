package com.divya.assignment2;

public class TrainerTask2 {

    String name;
    String department;
    String email;
    int id;


    //Constructor
    TrainerTask2(String trainer_name, String trainer_dept, String trainer_email, int trainer_id) {

        name = trainer_name;
        department = trainer_dept;
        email = trainer_email;
        id = trainer_id;
    }

    public static void main(String[] args) {

        TrainerTask2 t1 = new TrainerTask2("Mukesh","Testing","mukesh@gmail.com",1);
        TrainerTask2 t2 = new TrainerTask2("Hitesh","Dev","Hitesh@gmail.com",2);
        TrainerTask2 t3 = new TrainerTask2("Mukesh","DevOps","mukesh@gmail.com",3);

        // Trainer info. Array
        TrainerTask2[] trainerArray = new TrainerTask2[3];
        trainerArray[0] = t1;
        trainerArray[1] = t2;
        trainerArray[2] = t3;

        //display Trainer info.
        System.out.println("Trainers Information ");
        for(int i=0; i<trainerArray.length; i++){
            System.out.println("-------------------------------");
            System.out.println("Trainer id    : " + trainerArray[i].id);
            System.out.println("Trainer Name  : " + trainerArray[i].name);
            System.out.println("Trainer Dept  : " + trainerArray[i].department);
            System.out.println("Trainer email : " + trainerArray[i].email);

        }


    }

}
