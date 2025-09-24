package leetcode;
public class LeetCode424 {
    public static int characterReplacement(String s, int k) {
        
        int maxCount=0;
        
        for(int i=0;i<s.length();i++){
            int arr[]=new int[26];
            int maxf=0;
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                arr[c-'A']++;
                maxf=Math.max(maxf,arr[c-'A']);
                int changes=((j-i)+1-maxf);
                if(changes<=k){
                    maxCount=Math.max(maxCount,j-i+1);
                }else{
                    break;
                }
            }
            
        }
        return maxCount;
    }
    public static void main(String[] args){
        String s="ABAB";
        int k=2;
        System.out.println(characterReplacement(s,k));
    }
}
