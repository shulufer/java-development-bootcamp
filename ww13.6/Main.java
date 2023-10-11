import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

      Path path = Paths.get("emails.txt");

      List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

      names.forEach(name -> System.out.println("Hello, " + name + "!"));


    }
}
