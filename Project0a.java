/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project0a;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ntsia
 */
public class Project0a {

    /**
     * @param args the command line arguments
     * We initialize here all the variables that will be used by multiple methods. We could also do this in main and then call them using main.methodname but for a program of this size, this solution is simpler.
     * I also tried to incorporate different data types for numbers, just to test them.
     */
    static Scanner sc = new Scanner(System.in);
    static String name;
    static short birth_year;
    static byte age;
    static String city;
    static String married;
    static String colour;
    static byte years_married;
    static short date_married;
    static String married_with_kids;
    static byte kidsNum;
    static ArrayList<String> kidNames = new ArrayList<String>();
    static ArrayList<Integer> kidAge = new ArrayList<Integer>();;
    //I entered the possibility for ten children, this can easily be expanded.
    static String[] kidSequence = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"};
    
    public static void main(String[] args) {
    
    //We are going to create a number of void methods that change the value of our variables inside them. We could also have them return the value and change the variable in main, but it is simpler this way.   
    userName();
    userBirthYear();
    userAge();
    userCity();
    userMarried();
        if (married.equals("no")){
            
            userColour();
        
            System.out.println("Dear " +name+ " you were born in " +birth_year+ " so you are " +age+ " years old and you were born in the city of " +city+ ". You are not married and your favorite colour is " +colour+ "." );
        
        }
        
        else {
            
            userMarriage();
            
            if (married_with_kids.equals ("no")) {
                
                userColour();
                
                System.out.println("Dear " +name+ " you were born in " +birth_year+ " so you are " +age+ " years old and you were born in the city of " +city+ ". You have been married for " +years_married+ " "
                        + "years and you got married in " +date_married+ " and you don't have any children. Your favourite colour is " +colour+ ".");
            }
            
            //I created an extra possible outcome, for where there is only one child, in order for the text output to be correct grammaticaly.
            else {
            
                kids();
                userColour();
                
                if (kidsNum == 1){
                
                    
                    
                    System.out.println("Dear " +name+ " you were born in " +birth_year+ " so you are " +age+ " years old and you were born in the city of " +city+ ". You have been married for " +years_married+ " "
                        + "years and you got married in " +date_married+ " and you have 1 child. The name of your child is " +kidNames.get(0)+ " and was born in the year " +(2020 - (kidAge.get(0)))+ ". "
                                + "Your favourite colour is " +colour+ ".");
                }
                else{
                System.out.println("Dear " +name+ " you were born in " +birth_year+ " so you are " +age+ " years old and you were born in the city of " +city+ ". You have been married for " +years_married+ " "
                        + "years and you got married in " +date_married+ " and you have " +kidsNum+ " children.");
                
                for (byte j = 0; j <= (kidsNum-1); j++) {
                    System.out.println("The name of your " +kidSequence[(j)]+ " child is " +kidNames.get(j)+ " and was born in the year " +(2020-(kidAge.get(j)))+ ".");
                }
                System.out.println("Your favourite colour is " +colour+ ".");
                
            }
        }
    }
   }
        public static void userName(){
            System.out.print("What is your name? ");
            name = sc.next();
        }
    
        public static void userBirthYear() {
    
            System.out.print("What year were you born? ");
            birth_year = sc.nextShort();
        }
        
        public static void userAge(){
            age = (byte)(2020 - birth_year);
        }
        
        public static void userCity(){
            System.out.print("What is the name of the city you were born? ");
            city = sc.next();
        }
        
    
        public static void userMarried(){
        System.out.print("Are you married? ");
        married = sc.next();
        married = married.toLowerCase();
        }
        
        public static void userColour(){
            System.out.print("What is your favorite colour? ");
            colour = sc.next();
        }
        
        public static void userMarriage(){
            System.out.print("How many years have you been married? ");
            years_married = sc.nextByte();
            System.out.print("What year did you get married? ");
            date_married = sc.nextShort();
            System.out.print("Do you have any children? " );
            married_with_kids = sc.next();
            married_with_kids = married_with_kids.toLowerCase();
        }
        
        public static void kids(){
            System.out.print("How many children do you have? ");
            kidsNum = sc.nextByte();
            
            for (byte i = 0; i <= (kidsNum-1); i++) {
                    System.out.print("What is the name of your "+kidSequence[(i)]+ " child? ");
                    String newName = sc.next();
                    kidNames.add(newName);
                    System.out.print("What is the age of your " +kidSequence[(i)]+ " child? ");
                    Integer newAge = sc.nextInt();
                    kidAge.add(newAge);
                    
            }
        
        
        }
}
