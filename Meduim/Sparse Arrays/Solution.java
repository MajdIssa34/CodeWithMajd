import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    
    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries){
        List<Integer> results = new ArrayList<>(); // List to hold the results for each query
        
        // Build a map with frequency count of each string in stringList
        Map<String, Integer> map = getMap(stringList);
        
        // For each query string, fetch its count from the map
        for(String queString : queries){
            if(map.containsKey(queString)){
                results.add(map.get(queString)); // Add count if present
            }
            else{
                results.add(0); // Add 0 if query string not found in map
            }
        }
        return results;
    }
    
    // Helper function to count occurrences of each string in the input list
    public static Map<String, Integer> getMap(List<String> stringList){
        Map<String, Integer> results = new HashMap<String, Integer>();
        
        // Iterate through the input string list
        for(String word: stringList){
            if(results.containsKey(word)){
                int numberOfOcc = results.get(word) + 1; // Increment count
                results.put(word, numberOfOcc);
            }
            else{
                results.put(word, 1); // First occurrence
            }
        }
        return results;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        // Set up buffered reader and writer for efficient I/O
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Read number of strings in the input list
        int stringListCount = Integer.parseInt(bufferedReader.readLine().trim());

        // Read each string and collect into a list
        List<String> stringList = IntStream.range(0, stringListCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        // Read number of queries
        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        // Read each query string and collect into a list
        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        // Call the function to get results for each query
        List<Integer> res = Result.matchingStrings(stringList, queries);

        // Write results to the output, each on a new line
        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        // Close I/O streams
        bufferedReader.close();
        bufferedWriter.close();
    }
}

