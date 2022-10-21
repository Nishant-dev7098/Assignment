import java.util.*;
public class StringFive {
       
    public static void main(String args[]) {
      long startTime = System.currentTimeMillis();
      StringBuffer sbr = new StringBuffer();
      for(int i=0;i<100000;i++)
      {
          sbr.append("String");
      }
      
      System.out.println("Time taken by String Buffer is "+(System.currentTimeMillis()-startTime)+"ms");
      
       startTime = System.currentTimeMillis();
    StringBuilder sb = new StringBuilder();
    
    for(int i=0;i<100000;i++)
    {
        sb.append("String");
    }
    System.out.println("Time taken by String Builder is "+(System.currentTimeMillis()-startTime)+"ms");
    }
    
   
    
}