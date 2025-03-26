# 🧵 Sparse Arrays – HackerRank

Given a collection of input strings and a collection of query strings, determine how many times each query string appears in the list of input strings. Return an array of the results.

---

## 📊 Example

**Input strings:**

    strings = ["aba", "baba", "aba", "xzxb"]

**Query strings:**

    queries = ["aba", "xzxb", "ab"]

**Result:**

    [2, 1, 0]

**Explanation:**
- "aba" appears 2 times
- "xzxb" appears 1 time
- "ab" appears 0 times

---

## 🔧 Function Signature (Java)

    List<Integer> matchingStrings(List<String> stringList, List<String> queries)

---

## 📥 Input Format

- The first line contains an integer `n`, the number of input strings.
- The next `n` lines each contain a string `strings[i]`.
- The next line contains an integer `q`, the number of queries.
- The next `q` lines each contain a query string `queries[i]`.

---

### 🧪 Sample Input

    4
    aba
    baba
    aba
    xzxb
    3
    aba
    xzxb
    ab

---

### 📤 Sample Output

    2
    1
    0

---

## 🎯 Objective

For each query string, count how many times it occurs in the list of input strings and return the results in order.

---

## 📁 Location in This Repo

    DSA/
    └── SparseArrays/
        ├── Solution.java
        └── README.md

---

If you found this helpful, feel free to ⭐ the repo and follow along for more!
