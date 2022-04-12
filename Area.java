package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

//ask user for Radius
//calculate area
//print

public class Area {
    //put a main method here
    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
   }

    //declare variables here


    //create constructor
    public Area() {

    }

    //create methods here
    public void calculateArea() {
        //ask user for radius-need to import Scanner.  what is data type of radius? double
        Scanner input = new Scanner(System.in);
        try {
            boolean keepOnLooping = true;
            while (keepOnLooping) {
                Double myUsersRadius = input.nextDouble();

                //add validation
                if (myUsersRadius < 0) {
                    System.out.println("You can't enter a negative number");
                } else {
                    ///calculate area=pi * radius* radius
                    Double area = Circle.getArea(myUsersRadius);

                    //print
                    System.out.println(area);

                    keepOnLooping = false;
                }
            }
        } catch(Exception error){
            System.out.println("You must provide a number");


        }

        //close Scanner
        input.close();


    }

}
