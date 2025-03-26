Here’s a **clean and GitHub-friendly `README.md`** for the **REST API: Total Goals by a Team** problem from HackerRank. This one is done right the first time — clean formatting, no broken code blocks, and easy to read.

---

### ✅ Place this in: `API-Practice/TotalGoalsByTeam/README.md`

```markdown
# ⚽ REST API: Total Goals by a Team – HackerRank

In this challenge, you’re working with a REST API that contains data about football matches. The goal is to determine the **total number of goals scored by a specific team** in a specific year — whether they played as the **home** or **away** team.

---

## 🌐 API Overview

You can retrieve matches by sending GET requests to the following endpoints:

- Home team results:
  
      https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team1=<team>&page=<page>

- Away team results:

      https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team2=<team>&page=<page>

- `<year>`: The year of the competition.
- `<team>`: The team name.
- `<page>`: The page number (pagination starts at 1).

---

## 📝 Example Requests

```
GET /api/football_matches?year=2011&team1=Barcelona&page=2
```

Returns matches where **Barcelona** was the **home team** in 2011, page 2.

```
GET /api/football_matches?year=2011&team2=Barcelona&page=1
```

Returns matches where **Barcelona** was the **away team** in 2011, page 1.

---

## 📦 API Response Fields

Each API response contains:

- `page`: Current page number
- `per_page`: Max results per page
- `total`: Total number of matches found
- `total_pages`: Number of pages
- `data`: Array of match records

Each match contains the following relevant fields:

- `team1`: Name of the home team
- `team2`: Name of the away team
- `team1goals`: Goals scored by the home team
- `team2goals`: Goals scored by the away team

---

## 📌 Problem Statement

Implement the function:

```java
int getTotalGoals(String team, int year)
```

### Parameters

- `team`: the name of the team (e.g. `"Barcelona"`)
- `year`: the year of the competition (e.g. `2011`)

---

### 🧠 Task

Return an integer representing the **total number of goals** scored by the given team across **all matches** (home and away) in the specified year.

---

## 📁 Location in This Repo

```
API-Practice/
└── TotalGoalsByTeam/
    ├── TotalGoalsFetcher.java
    └── README.md
```

---

If you found this helpful, feel free to ⭐️ the repo and explore more API and DSA problems!
```

---

Let me know if you'd like the Java solution with comments written out too!