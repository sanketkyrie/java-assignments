//write a java program to find the second highest number in an array
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer [] arr = new Integer [] {4,6,4,8,9,1,2,3};        
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Second highest elemet is "+arr[1]);
     }
}
