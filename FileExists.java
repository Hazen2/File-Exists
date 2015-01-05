import java.io.*;
import java.util.Scanner;

/**
 * This simple program demonstrates the file class exist method to determine
 * if a file exists before opening it.
 */

public class FileExists
{
  public static void main(String[] args) throws IOException
  {
   
    
    double accumulator = 0.0; // Declaring accumulator and setting value to 0.0.
    
    Scanner keyboard = new Scanner(System.in);
    
    // Prompt user for file name.
    System.out.println("Enter the name of the file.");
    String filename = keyboard.nextLine();
    
    // Create file object.
    File file = new File(filename);
    
    // Check if file exists.
    if (!file.exists())
      {
        System.out.println("The file " + filename + " does not exist.");
        System.exit(0);
      }

    // Open the file.
    Scanner inputFile = new Scanner(file);
    
    // Check if there is additional data to read.
    while (inputFile.hasNext())
    {
      double number;
      number = inputFile.nextDouble();
      accumulator += number;
      System.out.println(number);
    }
    
    // Display sum of numbers in text file.
    System.out.println("The sum of the numbers in the file totals " + accumulator + ".");

    // Close the file.
    inputFile.close();
    
  }
}
