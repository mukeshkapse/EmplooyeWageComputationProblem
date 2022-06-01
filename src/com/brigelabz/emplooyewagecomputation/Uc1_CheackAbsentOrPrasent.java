package com.brigelabz.emplooyewagecomputation;

import java.util.Random;

public class Uc1_CheackAbsentOrPrasent {
    static int random()
    {
        Random ran = new Random();       // creating random number 0and 1
        int i = ran.nextInt(2);
        return i;
    }

    static String attendence(){
        String atten;
        if (random()==1){                  //calling random()
            atten = "Present";
        }
        else   {
            atten = "Absent";
        }
        return atten;
    }


    public static void main(String[] args){
        System.out.println("The Employee is "+attendence());
    }
}

