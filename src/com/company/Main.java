package com.company;

 import java.util.Scanner;
 import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("The following are the number for each districts\n");
        String[] districts = {"Belize", "Cayo", "Orange Walk", "Corozal", "Stann Creek", "Toledo", "Get Statistics and Exit"};
        for(int i = 0; i < districts.length; i++){
            System.out.println(i + " - " + districts[i]);
        };
        System.out.println("\n");
        ArrayList<Integer> Student_Districts = new ArrayList<Integer>();

        int numOfStudents = 0;
        int userInput = 0;
        while(userInput != 6 )
        {

            System.out.print("Please enter the district in which student " + (numOfStudents) + " lives ");
            userInput = myObj.nextInt();
            if(userInput != 6 && userInput < 6 )
            {
                Student_Districts.add(userInput);
                numOfStudents++;

            };
        };
        System.out.println("\n\n");
        printTable(Student_Districts, numOfStudents,districts);


    }
    public static void printTable(ArrayList<Integer> Student_Districts, int numOfStudents, String[] districts)
    {
        System.out.println("Total number of students process :  " + numOfStudents);
        System.out.println("\t");
        for(int district = 0; district <= 5 ; district++){
            int counter = 0;
            for(int i = 0; i < numOfStudents ; i++ ){
                if(Student_Districts.get(i) == district){
                    counter++;
                }
            }
            float percentage = (counter * 100) / numOfStudents;
            System.out.println(districts[district] + ": \t" + counter + "\t" + percentage + "%\n");
        }
    }
}





