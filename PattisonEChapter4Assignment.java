//   Name:         Ethan Pattison
//   Course:       ISYS 216 
//   Professor:    Dr Kinuthia
//   Assignment:   Chapter 4 Programming 
//   Date:         3/1/2022


// Import scanner class to get keyboard data from user 
import java.util.Scanner;

public class PattisonEChapter4Assignment {

    public static void main(String[] args) {
        
        // Initialize scanner objects
        Scanner keyboard = new Scanner(System.in);
        
        // Declare Variables
        double HighestSalesAmount = 0;
        double LowestSalesAmount = 0;
        double SalesAmount = 0;
        int Count = 0;
        
        // Display statement to explain program
        System.out.printf("When the program ends it will display the highest and lowest sale amounts.\n\n");
        
        // Set loop to ask the user to enter a sale amount
        while (true){
                
                // Ask manager (user) to enter a sale amount
                System.out.println("Enter a sale amount (-1 ends the program): ");
                SalesAmount = keyboard.nextDouble();
                
                // Create a way for the user to end the program (-1)
                if (SalesAmount == -1){
                    break;
                    }
                
                // If user only enters one Sale amount 
                if (Count == 0){
                    HighestSalesAmount = SalesAmount;
                    LowestSalesAmount = SalesAmount;
                    Count = 1;
                } 
                
                // If user enters multiple Sale amounts
                else
                    
                // Get the Lowest Value
                if (SalesAmount < LowestSalesAmount){
                    LowestSalesAmount = SalesAmount;
                }
                    // Get the Highest Value
                if (SalesAmount > HighestSalesAmount){
                    HighestSalesAmount = SalesAmount;
                }
                }
        
    // Add Spacing
    System.out.println("");
    
    // Display the Highest and Lowest Sales amounts
    System.out.printf("The highest sales amount is: $%.2f\n",HighestSalesAmount);
    System.out.printf("The lowest sales amount is: $%.2f\n", LowestSalesAmount);
    }
}