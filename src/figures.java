import java.util.Scanner;


public class figures {

	private static Scanner scan = new Scanner(System.in);
	
	public static int getSize()
	{
		int size = 0;
		while(true)
		{
			System.out.print("Enter the size of the figure (odd number):");
			size = scan.nextInt();
			if (size %2 == 1) return size;
			System.out.println("Invalid figure size - must be odd number.");
		}
			
	}
	
	public static void main(String[] args) {
	
		//Heading comment
		System.out.println("Programming Fundamentals: Summer Session 2");
		System.out.println("Name: Gabby Ryan");
		System.out.println("Date Submitted: 7/31/2020");
		System.out.println("Programming Assignment 2 - Figures");
		System.out.println(" ");
		
		int size = getSize();
		
		int option = 0;
		while (true)
		{
			//Display all the Menu options
			System.out.println("MENU:");
			System.out.println("1. Print box");
			System.out.println("2. Print Diamond");
			System.out.println("3. Print X");
			System.out.println("4. Quit Program");
			System.out.println(" ");
			System.out.println("Please select an option.");
			option = scan.nextInt();
			System.out.println(" ");
			
			switch (option)
			{
			case 1:
				printBox(size);
				break;
			case 2:
				printDiamond(size);
				break;
			case 3:
				printX(size);
				break;
			case 4:
				System.out.println("Good bye!");
				System.exit(0);
				break;
			
			default:
				System.out.println("Invalid Selection.");
				
		}
	}
}
	private static void printBox(int size)
	{
		System.out.println();
		
		for (int row = 1; row <= size; row++)
		{ 
			for (int col = 1; col <= size; col++)
			{
			System.out.print("X");
			}
			System.out.println();
		}
	}
	
	private static void printDiamond(int size)
	//Need to split into the top half and bottom half 
	{
		{ 
	        int i, j, k = 0; 
	      
	       //top half 
	        for (i = 1; i <= size; i++) { 
	      
	            for (j = 1; j <= size - i; j++) { 
	                System.out.print(" "); 
	            } 
	      
	            while (k != (2 * i - 1)) { 
	                if (k == 0 || k == 2 * i - 2) 
	                    System.out.print("X"); 
	                else
	                    System.out.print(" "); 
	                k++; 
	            } 
	            k = 0; 
	      
	            System.out.println(); 
	        } 
	        size--; 
	      
	        // bottom half
	        for (i = size; i >= 1; i--) { 
	      
	            for (j = 0; j <= size - i; j++) { 
	                System.out.print(" "); 
	            } 
	      
	            k = 0; 
	            while (k != (2 * i - 1)) { 
	                if (k == 0 || k == 2 * i - 2) 
	                    System.out.print("X"); 
	                else
	                    System.out.print(" "); 
	                k++; 
	            } 
	            System.out.println(); 
	        } 
	    } 
	} 
	  
		

	private static void printX(int size)
	//Split into 3 sections to make the X
	{
	    System.out.println();
        // top section
        int bigSpace = size - 2;
        int startSpace = 0;
      
        for (int topRow = 1; topRow <= (size - 1) / 2; topRow++) {
          
        	for (int space = 1; space <= startSpace; space++)
                System.out.print(" ");
            	System.out.print("X");
            
            for (int space = 1; space <= bigSpace; space++) {
                System.out.print(" ");
            }
            System.out.print("X");
            System.out.println();
            
            bigSpace -= 2;
            startSpace += 1;
        }
        
        // middle section
        for (int space = 1; space <= startSpace; space++)
            System.out.print(" ");
        	System.out.println("X");
        	bigSpace = 1;

        // lower section
        for (int topRow = 1; topRow <= (size - 1) / 2; topRow++) {
            startSpace -= 1;
            
            for (int space = 1; space <= startSpace; space++)
                System.out.print(" ");
            System.out.print("X");
            
            for (int space = 1; space <= bigSpace; space++) {
                System.out.print(" ");
            }
            
            System.out.print("X");
            System.out.println();
            bigSpace += 2;
	}
	
  }
}
