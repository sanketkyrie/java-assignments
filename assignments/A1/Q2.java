//write a java program to count the number of words in a string using hashMap.

import java.io.*;
import java.util.*;
class Q2 {
	static void characterCount(String inputString)
	{
        Map <String, Integer > map = new HashMap <>();
        String[] tokens = inputString.split(" ");
        for(String token:tokens){
            Integer count = map.get(token);
            if(count == null){
                map.put(token,1);
            }
            else{
                map.put(token,count + 1);
            }
        }
        System.out.println(map);
	}

	public static void main(String[] args)throws Exception
	{
        System.out.println("Question 2");
		String str = "hello world, welcome to Quantiphi";
		characterCount(str);
	}
}
