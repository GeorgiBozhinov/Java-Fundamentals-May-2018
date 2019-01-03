import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        String minNumber = Stream.of(input).
                min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(minNumber);
    }
}
