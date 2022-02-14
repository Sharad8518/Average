/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Main
{
  public static void main (String[]args)
  {

    Scanner in = new Scanner (System.in);


    float avg, p, c, m, h, e;


      System.out.println ("Enter number in physics");
      p = in.nextFloat ();

      System.out.println ("Enter number in chemistry");

      c = in.nextFloat ();

      System.out.println ("Enter number in math");

      m = in.nextFloat ();

      System.out.println ("Enter number in hind");

      h = in.nextFloat ();

      System.out.println ("Enter number in English");

      e = in.nextFloat ();

      avg = (p + c + m + h + e) / 5;


      System.out.println ("Average of result = " + avg);




  }
}
