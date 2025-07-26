package Collections;
import java.util.*;
public class SetIntersection {
    public static void main(String[] args) {
        Set<Integer> set1=new LinkedHashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2=new LinkedHashSet<>(Arrays.asList(3,4,5,6,7));
        Set<Integer> result=intersection(set1,set2);
        System.out.println(result);
        
    }
    static Set<Integer> intersection(Set<Integer> set1,Set<Integer> set2){
        Set<Integer> set=new LinkedHashSet<>();
        set1.retainAll(set2);
        set.addAll(set1);
        return set;
        
    }
}
