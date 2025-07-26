package Srings;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        // Demo d=new Demo();
        // String str1="hello";
        // String str2=new String("hello");
        


        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(d);
        // System.out.println(str1==str2); //compares reference
        // System.out.println(str1.equals(str2)); //compares content

        // String str3="hello world";
        // String str4="hello"+" world"; //compile time concatination
        // System.out.println(str3==str4);
        // System.out.println(str3.equals(str4));

        // //String builder
        StringBuilder str5 = new StringBuilder("hello");
        StringBuilder str6 = new StringBuilder("hello");
        // System.out.println(str5==str6); 
        System.out.println(str5.equals(str6)); //returns false because it compares reference, not content
        int arr1[]={1,2};
        int arr2[]={1,2};
        String s = "h";
        String s2 = "h";
        String s3 = new String("h");
        System.out.println(s.equals(s3)); //return true because it compares content
        
         
    }
}

class Demo{
    public String toString(){
        return "demo_object";
    }

}