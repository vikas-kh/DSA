package leetcode;
import java.util.*;
public class Leetcode151{
    public static void main(String[] args){
        String s="cat bat mat";
        
        String arr[]=s.split(" ");
        
        int p1=0;
        int p2=arr.length-1;
        while(p1<=p2){
            swap(arr,p1,p2);
            p1++;
            p2--;
        }
        StringBuilder sb=new StringBuilder();
        for(String x: arr) sb.append(x+" ");
        System.out.println(sb);
    
    }
    public static void swap(String[] arr,int p1,int p2){
        String temp=new String();
        temp=arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;
    }
}
