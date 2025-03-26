# 🧗 Climbing the Leaderboard (Dense Ranking) – HackerRank

An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses **Dense Ranking**, meaning:

- The player with the highest score is ranked **1**.
- Players with **equal scores share the same rank**.
- The **next player(s)** get the **immediate next rank** (no gaps).

---

## 📊 Example

**Leaderboard scores:**

    ranked = [100, 90, 90, 80]

**Ranks:**

    [1, 2, 2, 3]

**Player scores (in order of games played):**

    player = [70, 90, 105]

**Player ranks after each game:**

    [4, 2, 1]

---

## 🔧 Function Signature (Java)

    List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player)

---

## 📥 Input Format

    4
    100 90 90 80
    3
    70 90 105

## 📤 Output Format

    4
    2
    1

---

## 🎯 Objective

Given a list of scores on the leaderboard and a list of scores the player achieves, return a list of the player’s rank **after each game**, following the **dense ranking** rules.

---

## 📁 Location in This Repo

You can find the code and explanation in:

    DSA/
    └── ClimbingLeaderboard/
        ├── ClimbingLeaderboard.java
        └── ClimbingLeaderboard.md

---

If you find this helpful, feel free to ⭐️ the repo and follow along as I solve more challenges!
