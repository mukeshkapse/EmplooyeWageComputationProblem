package com.brigelabz.emplooyewagecomputation;

import java.util.Random;

public class Uc2_CalculateDailyEmpWage {
    static int random(){
        Random ran = new Random();
        int i = ran.nextInt(2)+1;
        return i;
    }

    static String attendence(){
        String att;
        if (random()==1){
            att = "Present";
        }
        else   {
            att = "Absent";
        }
        return att;
    }
    static int hours(){
        int emphrs;
        if (random()==1){
            emphrs =8;
        }
        else {
            emphrs =0;
        }
        return emphrs;
    }

    static int total_wage(){
        int total_wage=hours()*wage_per_hour;
        return total_wage;
    }

    public static final int random = random();
    public static int wage_per_hour =20;

    public static void main(String[] args){

        System.out.println("Employee is "+attendence());
        System.out.println("The total wage of employee is "+total_wage());

    }
}
