//given a string,find the first repeated character in it using stram funcions

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q6{
    public static void main(String[] args){
        String myStr = "saankethelloworld";
        myStr = myStr.toLowerCase();
        Map<Integer, Long> chars = myStr.codePoints().mapToObj(cp -> cp).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        int pos = chars.entrySet().stream().filter(e -> e.getValue() > 1L).findFirst().map(Map.Entry::getKey).orElse(Integer.valueOf(Character.MIN_VALUE));
        System.out.println(String.valueOf(Character.toChars(pos)));
    }    
}
