# learn-java — DSA Placement Prep

A personal journey through Data Structures & Algorithms in **Java**, built one problem at a time. This repo tracks my practice as I work toward placement readiness — organized by topic, with a focus on understanding *patterns* over memorizing solutions.

---

## About

This is a learning repository where I solve DSA problems (mostly from [LeetCode](https://leetcode.com/)) and group them by the core technique they teach. The goal isn't just to get an "Accepted" — it's to recognize *which pattern* a problem belongs to, so the next one gets easier.

---

## Repository Structure

```
learn-java/
└── src/
    ├── arrays/         # Array fundamentals & traversal
    ├── binaryseach/    # Binary search & variants
    ├── companies/      # Company-tagged practice problems
    ├── hashmap/        # HashMap & HashSet problems
    ├── mathlogic/      # Math & number-theory problems
    ├── recursion/      # Recursion fundamentals
    ├── sorting/        # Sorting algorithms & applications
    ├── stack/          # Stack-based problems
    ├── strings/        # String manipulation
    ├── twodarray/      # 2D array problems
    └── twopointer/     # Two-pointer technique
```

---

## ✅ Problems Solved

### Arrays & Hashing
| # | Problem | Difficulty | Pattern |
|---|---------|------------|---------|
| 1 | Two Sum | Easy | HashMap + complement |
| 217 | Contains Duplicate | Easy | HashSet membership |
| 242 | Valid Anagram | Easy | Frequency count |
| 49 | Group Anagrams | Medium | Sorted string as key |
| 347 | Top K Frequent Elements | Medium | Bucket sort |
| 238 | Product of Array Except Self | Medium | Prefix / suffix products |
| 560 | Subarray Sum Equals K | Medium | Prefix sum + HashMap |

### Two Pointers
| # | Problem | Difficulty | Pattern |
|---|---------|------------|---------|
| 125 | Valid Palindrome | Easy | Converging pointers |
| 167 | Two Sum II (Sorted) | Medium | Two pointers on sorted array |
| 15 | 3Sum | Medium | Sort + fixed element + two pointers |

---

## 🧠 Patterns Learned

- **HashMap + complement** — "find a pair that satisfies X" (Two Sum)
- **HashSet membership** — "have I seen this before?" (Contains Duplicate)
- **Frequency counting** — `getOrDefault(key, 0) + 1` for counting occurrences
- **Sorted key grouping** — sort a string/array to use as a grouping key
- **Bucket sort** — index represents frequency, for top-K problems
- **Prefix / suffix products & sums** — precompute running products/sums to avoid nested loops
- **Two pointers** — converging pointers on sorted data for pair/triplet problems

---

## 🛠️ Tech

- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Practice Platform:** LeetCode

---

## 🎯 Goal

Build strong pattern recognition across the core DSA topics that appear in online assessments and technical interviews — and to need a little less help with each problem solved.

---

*Work in progress — updated as I solve more. 🌱*