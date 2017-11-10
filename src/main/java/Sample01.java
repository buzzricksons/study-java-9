import java.util.stream.Stream;

public class Sample01 {
    public static void main(String[] args) {
        takeWhile();
        dropWhile();

    }

    public static void takeWhile () {
        System.out.println("takeWhile 1:");
        Stream.of("A is Java", "B is Groovy", "C is Kotlin", "D is Scala", "E is Python", "F is Go")
                .takeWhile(s -> !s.contains("Scala"))
                .forEach(System.out::println);//"A is Java", "B is Groovy", "C is Kotlin"

        System.out.println("takeWhile 2:");
        Stream.of(1, 2, 3, 4, 5, 6)
                .takeWhile(i -> i < 3)
                .forEach(System.out::println);//1, 2
    }

    public static void dropWhile () {
        System.out.println("dropWhile 1:");
        Stream.of("A is Java", "B is Groovy", "C is Kotlin", "D is Scala", "E is Python", "F is Go")
                .dropWhile(s -> !s.contains("Scala"))
                .forEach(System.out::println);//"D is Scala", "E is Python", "F is Go"

        System.out.println("dropWhile 2:");
        Stream.of(1, 2, 3, 4, 5, 6)
                .dropWhile(i -> i < 3)
                .forEach(System.out::println);//3,4,5,6
    }
}
