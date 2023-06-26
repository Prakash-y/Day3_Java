package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOException 
{
  public static void main(String[] args) 
  {
	 try
	  {
		  File f = new File("Demo.txt");
		  Scanner sc = new Scanner(f);
	 }
	  catch(FileNotFoundException e)
	  {
		  System.out.println("Error : File not found!");
	  }
	
  }
}
