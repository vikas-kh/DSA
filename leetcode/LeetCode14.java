package leetcode;
public class LeetCode14 {
   public static void main(String[] args){
    String [] str={"flower","flow","flight"};
    System.out.println(longestCommonPrefix(str));
   }
   public static String longestCommonPrefix(String[] strs) {
        //first find the lowest size string
        int flag;
        String ans="";
        int minLength=findLowSize(strs);
        for(int i=0;i<minLength;i++){
            char ch=strs[1].charAt(i);
            flag=1;
            for(int j=0;j<strs.length;j++){
                if(ch!=strs[j].charAt(i)){
                    flag=0;
                    break;
                }
            }
            if(flag==0) return ans;
            else{
                ans+=strs[1].charAt(i);
            }
            
        }
        return ans;
    }
    public static int findLowSize(String[] strs){
        int min=strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
            }
        }
        return min;
    }
}