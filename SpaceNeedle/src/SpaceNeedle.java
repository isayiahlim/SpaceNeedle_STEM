/*
 * Isayiah Lim
 * 9/30/2021
 * APCS Period 2
 * Space Needle Project
 * 
 * This program prints out an ASCII Space Needle, which can be scaled by changing the SCALE Integer
 */
public class SpaceNeedle
{
    //scale number
	public static final Integer SCALE = 4;
	
	//main method, prints out the whole needle
	public static void main(String[] args)
    {
    	needle();
    	
    	
    	needle();
    }
	
	//needle prints out the spire at the top of the building and the thin needle under the body
    public static void needle()
    {
    	//makes the correct number of rows
    	for(int i = 0; i < SCALE; i++)
    	{
    		//prints the scaled number of spaces before the needle
    		for(int j = 0; j < 3*SCALE; j++)
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
    	for(int i = 0; i < SCALE; i++)
    	{
    		//adds spaces before the shape begins
    	}
    	
    	//prints out the bottom line of the shape
    }
}
