import java.util.ArrayList;
import java.util.List;

public class sortingUsingStreams {
    public static void main(String[] args) {
        // - Write a lambda expression to sort a list of strings in descending order of length.
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("fig");
        sortStringOnLength(stringList);
        // - Sort a list of objects by a specific attribute (e.g., age, name) using the Stream API.
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 25));
        personList.add(new Person("Charlie", 35));
        personList.add(new Person("David", 28));
        sortOnAge(personList);
    }

    private static void sortOnAge(List<Person> personList) {
        List<Person> sortedPersons = personList.stream()
        .sorted((person1, person2)->Integer.compare(person1.getAge(), person2.getAge()))
        .toList();
        System.out.println(sortedPersons);
    }

    private static void sortStringOnLength(List<String> stringList) {
        List<String> sortedStrings = stringList.stream()
        .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
        .toList();
        System.out.println(sortedStrings);
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return name + " " + age;

    }
}