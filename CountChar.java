
// In LinkedHashMap : Data is stored in <key, value> pair
// Here's in LinkedHashMap, data stored in the same order of occurence of in input : 
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char arr[] = s.toCharArray();
        int size = s.length();

        Map<Character, Integer>map = new LinkedHashMap<>();

        int i=0;
        while(i!=size){
            if(map.containsKey(arr[i])==false){
                map.put(arr[i], 1);
            }else{

                int oldVal = map.get(arr[i]);
                int newVal = oldVal+1;
                map.put(arr[i], newVal);

            }
            i++;

        }

        for(Map.Entry data:map.entrySet()){
            System.out.print(data.getKey()+""+data.getValue());
        }
        
    }
    
}