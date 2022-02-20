import java.util.*;

public class Q3 {
    public static void main(String[] args){
        ArrayList <String> arr = new ArrayList<String>();
        arr.add("Action");
        arr.add("Drama");
        arr.add("Animation");
        arr.add("Horror");
        arr.add("Comedy");

        System.out.println("Advanced for loop");
        arr.forEach((e)->{
            System.out.println(e);
        });

        System.out.println("\nWhile loop");
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\nFor loop");
        for(String i:arr){
            System.out.println(i);
        }

    }
}