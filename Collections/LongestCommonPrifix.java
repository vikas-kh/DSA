package Collections;

public class LongestCommonPrifix {
    public static void main(String[] args) {
        String []arr={"flower","flow","flight"};
        System.out.println(findPrefix(arr));
    }
    // public static String findPrefix(String[] arr){
    //     String ans="";
    //     int minLength=arr[0].length();
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i].length()<minLength){
    //             minLength=arr[i].length();
    //         }
    //     }
    //     for(int i=0;i<minLength;i++){
    //         int flag=1;
    //         for(int j=0;j<arr.length;j++){
    //             char ch=arr[i].charAt(i);
    //             if(ch!=arr[j].charAt(i)){
    //                 flag=0;
    //                 return ans;
    //             }
    //         }
    //         if(flag==1){
    //             ans+=arr[i].charAt(i);
    //         }
    //     }
    //     return ans;
    // }
    public static String findPrefix(String[] arr){
        if(arr.length==0 || arr==null) return "";
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++){
            while(!arr[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;

    }
}
