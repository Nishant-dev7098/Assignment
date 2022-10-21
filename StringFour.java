import java.util.*;
public class StringFour {
   public int printRepeated(String str)
   {
       HashMap<Character,Integer> map=new HashMap<>();
       int count=0;
       for(int i=0;i<str.length();i++)
       {
           if(map.containsKey(str.charAt(i)) && map.get(str.charAt(i))==1)
           {
               count++;
               map.put(str.charAt(i),2);
           }
           if(!map.containsKey(str.charAt(i)))
            map.put(str.charAt(i),1);
                
       }
       return count;
       
   }
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       StringFour st=new StringFour();
       System.out.println(st.printRepeated(str));
       
    }
}