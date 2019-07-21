
import java.lang.*;

// WS15
class WE extends RuntimeException {
  public WE(int wert) {super();
    if (wert>7) throw new PE();}
}

class PE extends RuntimeException{
  public PE(){super();}
}

public class Ausnahme 
{
  public static void main(String[] args)
  {
    int [] einFeld = new int[5];   // Array mit 5 Speicher
    
    for(int i= 0; i<10;i++)			// Schleifendurchlauf i kleiner 10
    {
      try
      {
         einFeld[i] =i;
         if (einFeld[i]>6) throw new WE(einFeld[i]);
      }
      
     // catch(WE we)
      //{
    	 // einFeld[i] = -42;
      //}
      
      catch(ArrayIndexOutOfBoundsException aioobe)
      {
        int[] tempFeld = new int [einFeld.length+5];
        
        for(int j=0; j<einFeld.length; j++) tempFeld[j] = einFeld[j];
        
        einFeld = tempFeld;
      }
      
      catch(WE we)
      {
    	  einFeld[i] = -42;
      }
      
      catch(RuntimeException re)
      {
    	  einFeld[i] = -1;
      }
      
      finally{System.out.println("einFeld["+i+"]="+einFeld[i]);}
    }
  }
}
