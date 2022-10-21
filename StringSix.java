import java.util.*;
public class StringSix {
       
    public static void main(String args[]) {
      String str1="Yash";
      String str2="Yash";
      
      String obj1=new String("Yash");
      String obj2=new String("Yash");
      
      System.out.println("Pointing to same refernce----> "+(str1==str2));
      //Same reference for both str1 and str2
      System.out.println("Pointing to same refernce----> "+(str1==obj1));
      //obj1 creates different refernce.
      System.out.println("Point to same reference----> "+(obj1==obj2));
      //obj2 creates different refernce
    }
}