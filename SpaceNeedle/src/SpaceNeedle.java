/*
 * Isayiah Lim
 * 9/30/2021
 * APCS Period 2
 * Space Needle Project
 * 
 * This program prints out an ASCII Space Needle, which can be scaled by changing the SIZE Integer
 */
public class SpaceNeedle
{
    //SIZE number
	public static final Integer SIZE = 4;
	
	//main method, prints out the whole building
	public static void main(String[] args)
    {
    	needle();
    	top();
    	bottom();
    	needle();
    	middle();
    	top();
    }
	
	//needle prints out the spire at the top of the building and the thin needle under the body
    public static void needle()
    {
    	//makes the correct number of rows
    	for(int i = 0; i < SIZE; i++)
    	{
    		//prints the SIZEd number of spaces before the needle
    		for(int j = 0; j < 3*SIZE; j++)
    		{
    			System.out.print(" ");
    		}
    		//then makes the needle itself
    		System.out.print("||");
    		System.out.println();
    	}
    }
    
    //top prints the top half of the main body as well as the base
    public static void top()
    {
    	//makes the number of rows
    	for(int i = 0; i < SIZE; i++)
    	{
    		//adds spaces before the shape begins
    		for(int j = 0; j < 3*(SIZE - 1) - 3*i; j++)
    		{
    			System.out.print(" ");
    		}
    		
    		//adds underscores and the forward slash
    		System.out.print("__/");
    		
    		//adds the colons
    		for(int k = 0; k < 3*i; k++)
    		{
    			System.out.print(":");
    		}
    		
    		//backbone of the tower
    		System.out.print("||");
    		
    		//colons after the shape
    		for(int l = 0; l < 3*i; l++)
    		{
    			System.out.print(":");
    		}
    		
    		//backslash and underscores the body of the shape
    		System.out.print("\\__");
    		//makes it a new line
    		System.out.println();
    	}
    	//prints out the bottom line of the shape
    	System.out.print("|");

    	//adds the final quotations
    	for(int m = 0; m < 6*SIZE; m++)
    	{
    		System.out.print("\"");
    	}
    	System.out.print("|");
    	System.out.println();
    }
    
    //prints the bottom half of the shape
    public static void bottom()
    {
    	//makes the number of rows
    	for(int i = 0; i< SIZE; i++)
    	{
    		//adds spaces before the shape
    		for(int k = 0; k < 2*i; k++)
    		{
    			System.out.print(" ");
    		}
    		System.out.print("\\_");
    		
    		//makes the scaled number of triangles (/\)
    		for(int j = 0; j < (3*SIZE - 1) - 2 * i; j++)
    		{
    			System.out.print("/\\");
    		}
    		System.out.print("_/");
    		System.out.println();
    	}
    }
    
    //prints out the middle section
    public static void middle()
    {
    	//sets the number of rows to SIZE ^ 2
    	for(int i = 0; i < SIZE * SIZE; i++)
    	{
    		//makes the number of spaces
    		for(int j = 0; j < 2* SIZE + 1; j++)
    		{
    			System.out.print(" ");
    		}
    		
    		//adds the outside lines
    		System.out.print("|");
    		
    		//adds the beginning parentheses
    		for(int k = 0; k < SIZE - 2; k++)
    		{
    			System.out.print("%");
    		}
    		System.out.print("||");
    		
    		//add the final parentheses 
    		for(int l = 0; l < SIZE - 2; l++)
    		{
    			System.out.print("%");
    		}
    		System.out.print("|");
    		System.out.println();
    	}
    }
}
