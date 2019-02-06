import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
   
	 System.out.print("");
	 int num1 = in.nextInt();
   
	 System.out.print("");
	 int num2 = in.nextInt();
   
	 System.out.print("");
	 int num3 = in.nextInt();
   
   
	 if (num1 > num2)
	 if (num1 > num3)
	 System.out.println(""+num1);
   
	if (num2 > num1)
   	if (num2 > num3)
     System.out.println(""+num2);
   
	 if (num3 > num1)
	 if (num3 > num2)
     System.out.println(""+num3);
	}
}
