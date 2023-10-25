import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FilteringAndMapping{
    public static void main(String[] args) {
       //Given a list of integers, use a stream to filter out all the even numbers and return them.
       List<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            numbers.add(randomNumber);
        }
       filterEvenOut(numbers);


        //Given a list of strings, use a stream to transform each string to uppercase.
        List<String> names = new ArrayList<String>();
        names.add("alice");
        names.add("bob");
        names.add("charlie");
        names.add("dave");
        names.add("eve");
        names.add("frank");
        names.add("grace");
        names.add("helen");
        names.add("isabel");
        names.add("jack");

        transformToUpperCase(names);

    }

   private static void transformToUpperCase(List<String> names) {
        List<String> capNames = names.stream().map(e->e.toUpperCase()).toList();
        System.out.println(capNames);
    }

 private static void filterEvenOut(List<Integer> numbers) {
    
        List<Integer> evenNumbers=  numbers.stream().filter(e->e%2==0).toList();
        System.out.println(evenNumbers);
    }
}