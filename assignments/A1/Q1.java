import java.util.*;

public class Q1{
    public static void main(String[] args){
        Map<Integer, String> movies = new HashMap<Integer, String>();
        movies.put(1, "Comedy");
        movies.put(2, "Action");
        movies.put(3, "Horror");
        movies.put(4, "Sci-fi");
        movies.put(5, "Animation");

        System.out.println("Question 1\n");
        System.out.println("Iterate using advanced forEach loop\n");
        movies.forEach((key, value)->{
            System.out.println("Key = " + key + ", Value = "+ value);
        });

        System.out.println("\nIterate using While loop\n");
        Iterator <Integer> itr = movies.keySet().iterator();        
        while(itr.hasNext()){
            int key = (int)itr.next();
            System.out.println("Key = " + key + ", Value = "+ movies.get(key));

        }
    }
}