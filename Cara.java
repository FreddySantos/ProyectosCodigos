import java.util.Scanner;
/**
 * Write a description of class RelojBinario here.
 *4

1

HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH

2

TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT

3

HHTTTHHTTTHTHHTHHTTHTTTHHHTHTTHTTHTTTHTH

4

HTHTHHHTHHHTHTHHHHTTTHTTTTTHHTTTTHTHHHHT


funciona linea por linea
 */
public class Cara
{
   public static void main()
   {
        System.out.print('\u000c');
        Scanner tec = new Scanner (System.in);
        int N = tec.nextInt();
        for(int i=1 ; i<= N ; i++)
        {
              int p=tec.nextInt();
              int x1=0;
              int x2=0;
              int x3=0;
              int x4=0;
              int x5=0;
              int x6=0;
              int x7=0;
              int x8=0;
              String v1=tec.next();
              for(int c=0;c<38;c++)
              {
                  String d=v1.substring(c,c+3);
                  if(d.matches("TTT"))
                  {
                      x1++;
                  }
                  else if(d.matches("TTH"))
                  {
                      x2++;
                  }
                  else if(d.matches("THT"))
                  {
                      x3++;
                  }
                  else if(d.matches("THH"))
                  {
                      x4++;
                  }
                  else if(d.matches("HTT"))
                  {
                      x5++;
                  }
                  else if(d.matches("HTH"))
                  {
                      x6++;
                  }
                  else if(d.matches("HHT"))
                  {
                      x7++;
                  }
                  else if(d.matches("HHH"))
                  {
                      x8++;
                  }
         }
         System.out.println(p+" "+x1+" "+x2+" "+x3+" "+x4+" "+x5+" "+x6+" "+x7+" "+x8);
    }        
  }
}