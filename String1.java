import java.util.*;
public class String1 {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     String str1=sc.nextLine();
     String str2=sc.nextLine();
     
     int index=sc.nextInt();
     
     StringBuilder strsb = new StringBuilder(str1);
     
     strsb.insert(index,str2);
     
     System.out.println(strsb);
    }
}