import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class Solution {
    public static int getNumDraws(int year) {
        int totalDraws = 0;

        try {
            for (int goals = 0; goals <= 10; goals++) {
                String urlString = String.format(
                    "https://jsonmock.hackerrank.com/api/football_matches?year=%d&team1goals=%d&team2goals=%d",
                    year, goals, goals
                );
                URL url = new URL(urlString);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                br.close();

                JSONObject response = new JSONObject(sb.toString());
                totalDraws += response.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return totalDraws;
    }
}
