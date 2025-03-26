Thanks for the clarification — here's a clean and **valid `README.md` file** that works with GitHub rendering (no broken Markdown):

---

### ✅ `README.md`

```md
# REST API: Number of Drawn Matches

This Java program queries a REST API to determine how many football matches ended in a draw in a given year.  
A match is considered a **draw** if both teams scored the same number of goals.

## 📘 Problem Description

You are provided with an API that returns football match data.  
Your task is to calculate the **total number of drawn matches** (same score for both teams) in a specified year.

### ➕ API Endpoint

```
https://jsonmock.hackerrank.com/api/football_matches
```

### 🔍 Query Parameters

| Parameter     | Description                                     |
|---------------|-------------------------------------------------|
| `year`        | Year of the match (e.g., `2011`)                |
| `team1goals`  | Exact number of goals scored by team1           |
| `team2goals`  | Exact number of goals scored by team2           |
| `page`        | Page number for paginated results (default: 1)  |

You can query drawn matches by using:
```
https://jsonmock.hackerrank.com/api/football_matches?year=2011&team1goals=1&team2goals=1
```

## 🚀 Approach

1. Loop through possible goal values from `0` to `10`.
2. For each goal `g`, query the API where `team1goals = g` and `team2goals = g`.
3. Sum up the `total` field from each response — this represents drawn matches for that score.
4. Return the final sum.

This avoids fetching all match data and is **optimized using filters**.

## 💻 Example Usage

```java
int draws = getNumDraws(2011);
System.out.println("Drawn matches in 2011: " + draws);
```

## 📁 File Structure

- `GetNumDraws.java`: Java implementation of the solution
- `README.md`: Problem description and solution details

## 📦 Dependencies

- Java 8+
- `org.json` library for parsing JSON responses

## 📌 Notes

- Maximum goals checked per team is assumed to be 10 (can be adjusted).
- Network calls are handled using `HttpURLConnection`.

```

---

Let me know if you want the README split into sections for Hackerrank + Test Cases too!