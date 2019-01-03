import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentsByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> names = new LinkedHashMap<>();

        String line;
        while (!"END".equals(line = reader.readLine())) {

            String[] tokens = line.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int group = Integer.parseInt(tokens[2]);

            if (group == 2) {
                if (!names.containsKey(firstName)) {
                    names.put(firstName, lastName);
                } else if (names.containsKey(firstName)) {
                     names.put(firstName, lastName);
                }
            }
        }
        System.out.println();
    }
}
