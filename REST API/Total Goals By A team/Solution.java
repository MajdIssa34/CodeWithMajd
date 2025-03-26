import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class Solution {

    public static int getTotalGoals(String team, int year) {
        int totalGoals = 0;

        try {
            // First, process as team1 (home team)
            totalGoals += fetchGoals(year, team, true);

            // Then, process as team2 (away team)
            totalGoals += fetchGoals(year, team, false);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return totalGoals;
    }

    private static int fetchGoals(int year, String team, boolean isHomeTeam) throws Exception {
        int page = 1;
        int totalGoals = 0;
        int totalPages = 1;

        String baseUrl = "https://jsonmock.hackerrank.com/api/football_matches?year=" + year + 
                         (isHomeTeam ? "&team1=" : "&team2=") + team + "&page=";

        while (page <= totalPages) {
            URL url = new URL(baseUrl + page);
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
            if (page == 1) {
                totalPages = response.getInt("total_pages");
            }

            JSONArray data = response.getJSONArray("data");
            for (int i = 0; i < data.length(); i++) {
                JSONObject match = data.getJSONObject(i);
                int goals = Integer.parseInt(match.getString(isHomeTeam ? "team1goals" : "team2goals"));
                totalGoals += goals;
            }

            page++;
        }

        return totalGoals;
    }
}
