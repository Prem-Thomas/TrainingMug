package com.hosanna.TrainingMugExercise;

public class StudentManagementSystem5 {
    int id;
    String name;
    byte age;
    double perc;
    String sub;

    public static void main(String[] args) {
        StudentManagementSystem5 sms1 = new StudentManagementSystem5();
        sms1.id = 123;
        sms1.name = "David";
        sms1.age = 21;
        sms1.perc = 80.98;
        sms1.sub = "Java";
        System.out.println("Id : " + sms1.id + "\n" +"Name : " + sms1.name + "\n" + "Age :" +sms1.age + "\n" +"Percentage : " + sms1.perc + "\n" +"Subject :" + sms1.sub);
        System.out.println();

        StudentManagementSystem5 sms2 = new StudentManagementSystem5();
        sms2.id = 124;
        sms2.name = "Thomas";
        sms2.age = 21;
        sms2.perc = 82.28;
        sms2.sub = "Python";
        System.out.println("Id : " + sms2.id + "\n" +"Name : " + sms2.name + "\n" + "Age :" +sms2.age + "\n" +"Percentage : " + sms2.perc + "\n" +"Subject :" + sms2.sub);
        System.out.println();

        StudentManagementSystem5 sms3 = new StudentManagementSystem5();
        sms3.id = 125;
        sms3.name = "Prem";
        sms3.age = 21;
        sms3.perc = 80.13;
        sms3.sub = "PHP";
        System.out.println("Id : " + sms3.id + "\n" +"Name : " + sms3.name + "\n" + "Age :" +sms3.age + "\n" +"Percentage : " + sms3.perc + "\n" +"Subject :" + sms3.sub);


    }

}
