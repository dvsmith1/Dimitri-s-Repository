/* This file is for your INCLASS lab. You will find the code logic below.
 * Fill in the code to complete the task to read a file in the following
 * format and then write the information to a matching file along with
 * the total expenses for all the expenses in each file:
 * John Doe; Dinner; 102.00; 4/28/2017
 * Caleb Autry; Lodging; 300.00; 5/5/2017
 * Tonya Melvin; Conference; 1000.00; 6/5/2017
 * 
 * Test Runs:
 * 1. Test the program before creating the services.txt containing input information
 * 2. Test the program with the input information in the wrong format
 * 3. Test the program with the input in the correct format
 * 
 * Name: (your name here)
 * Assignment: combination P7.16 and P7.17
 * In 7.16: write the total amount for each service category to the file
 * In 7.17: write the information from the file to each matching file
 * For this lab: write the information and the total amount for each 
 * service category to each matching file
 * 
 * Pseudocode: in lieu of this, I am providing inline comments throughout the program
 * 
 */
import java.io.*;
import java.util.*;

public class ServiceFiles 
{
	public static void main(String[] args)
	{
	    //Initialize all variables  
		Scanner in = new Scanner(System.in);
	    String filename1 = "";
        double dinner = 0.0, conf = 0.0, lodging = 0.0;
        
        //Prompt the user for the filename
	    
	      
	    try
	    {
	    	//open each of the files for reading and writing
	    	//You can name each output file for the services listed above

	    	
	    	
	    	

	        String str = "", name = "", service = "", date = "";
	        //Finish the while loop to read in while there is information
	        //while (              )
	        {
	        	//Read in all but the date from the input file
	        	//the file name is services.txt
	           
	        	
	        	
	        	
	        	
	            
	            if (service.equals("Dinner"))
	            {
	                //Write information to output
	            	//Add the expense to the total
	            	 
	            }
	            else if (service.equals("Lodging"))
	            {
	                //Write information to output
	            	//Add the expense to the total   
	            }
	            else if (service.equals("Conference"))
	            {
	                //Write information to output
	            	//Add the expense to the total 
	            }
	            else //leave this in for students
	            {
	               throw new NoSuchElementException();
	            }
	            //Read the date last from the input file
	            //date = 
	         }//end of while
	        
	        //Write expenses to each file, using formatted output

	        
	        //Close all files

	      } //end of try statement
	      //catch the file error
	      {
	         System.out.println("File not found!");
	      }
	      //catch the bad element error
	      {
	         System.out.println("File format not valid.");
	      }

	}//main
} //class