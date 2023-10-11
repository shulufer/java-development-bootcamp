import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

      Path path = Paths.get("emails.txt");
      Stream<String> msgs = Files.lines(path);
      msgs.filter(msg -> !(msg.startsWith("Spam")))
            .forEach(msg -> System.out.println(msg));











      // List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

      // names.forEach(name -> System.out.println("Hello, " + name + "!"));

      // List<String> usernames = Arrays.asList("sparklingunicorn", "galactic_goddess", "neon_ninja", "purplepixiedust");

      // String name = usernames.stream()
      //                       .filter(username -> username.equals("neon_ninja"))
      //                       .findFirst().orElse(null);

      // System.out.println("Found you: " + name);

      // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

      // long countedNumbers = numbers.stream()
      //                             .filter(number -> number % 2 == 0)
      //                             .count();

      // System.out.println("There are " + countedNumbers + " even numbers in this list");




    }
}
