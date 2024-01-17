import org.ietf.jgss.GSSName;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Streams {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Other", Gender.PREFER_NOT_INFORM)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

        System.out.println(people.stream()
                .anyMatch(personPredicate));

        System.out.println(people.stream()
                .allMatch(personPredicate));

        System.out.println(people.stream()
                .noneMatch(personPredicate));

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    enum Gender {
        FEMALE, MALE, PREFER_NOT_INFORM
    }
}
