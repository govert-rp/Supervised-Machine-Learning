//********************************************************************
//
//  Author:        Giovanni Govert
//
//  Program #:     <Programming Assignment Number>
//
//  File Name:     <Program4.java>
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      20 March 2024
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       5
//
//  Description:   This program calculates a hotel's occupancy rate.
//
//********************************************************************

import java.util.Scanner;
public class Program5
{
    //***************************************************************
    //
    //  Method:       main
    // 
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A 
    //
    //**************************************************************

	public static void main(String[] args) {
		
		developerInfo();
		
		System.out.println("This program calculates a hotel's occupancy rate \n");
        
		// Declare and Initialize Variable
		int totalFloors;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("How many floors does the hotel have? ");
        
        //Read User's Input
        totalFloors = scanner.nextInt();
        int floorCounter = 1;
        int totalRooms = 0;
        int numRooms;
        int occupied = 0;
        int numOccupied;

        //Iterate through each floor to input the number of rooms and number of occupied rooms
        while (floorCounter <= totalFloors){
            System.out.printf("%nHow many rooms are on floor %d? ", floorCounter);
            numRooms = scanner.nextInt();
            totalRooms += numRooms;
            
            System.out.printf("How many of those rooms are occupied? ", floorCounter);
            numOccupied = scanner.nextInt();
            occupied += numOccupied;
            
            floorCounter +=1;
        }
        
        //Calculate nuber of unoccupied rooms
        int unoccupied = totalRooms - occupied;
        //Calculate Occupancy Rate
        double occupancyRate = (double) occupied / totalRooms *100;

        System.out.printf("%nThe hotel has a total of %d rooms. %n", totalRooms);
        System.out.printf("%d are occupied. %n", occupied);
        System.out.printf("%d are unoccupied. %n", unoccupied);
        System.out.printf("The occupancy rate is %.1f%% %n", occupancyRate);

        scanner.close();

	} // End of the main method
	
	//***************************************************************
    //
    //  Method:       developerInfo
    // 
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A 
    //
    //**************************************************************
    public static void developerInfo()
    {
       System.out.println("Name:    Giovanni Govert");
       System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
       System.out.println("Program: Five \n");

    } // End of the developerInfo method
    
    
}


