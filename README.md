# Java Data Structures & Algorithms

> A systematic approach to algorithmic problem solving, emphasizing pattern recognition over solution memorization to achieve placement readiness.

This repository serves as a structured documentation of my progression through core Data Structures and Algorithms (DSA). By organizing solutions around fundamental techniques rather than standalone problems, the focus remains on identifying reusable patterns for technical interviews and online assessments.

---

## Directory Architecture

The source code is organized by technical concepts, allowing for targeted practice and review.

```text
learn-java/
└── src/
    ├── arrays/         # Array fundamentals and traversal techniques
    ├── binarysearch/   # Divide and conquer search variants
    ├── companies/      # High-frequency problems by organization
    ├── hashmap/        # Key-value mapping and set operations
    ├── mathlogic/      # Number theory and mathematical deduction
    ├── recursion/      # Call stack management and base cases
    ├── sorting/        # Algorithmic sorting and their applications
    ├── stack/          # LIFO principles and monotonic stacks
    ├── strings/        # Character manipulation and parsing
    ├── twodarray/      # Matrix traversal and manipulation
    └── twopointer/     # Linear convergence and sliding windows

```

---

## Problem Ledger

### Arrays & Hashing

| ID | Problem | Difficulty | Core Pattern |
| --- | --- | --- | --- |
| 1 | Two Sum | Easy | HashMap & Complement |
| 217 | Contains Duplicate | Easy | HashSet Membership |
| 242 | Valid Anagram | Easy | Frequency Counting |
| 49 | Group Anagrams | Medium | Sorted String Keys |
| 347 | Top K Frequent Elements | Medium | Bucket Sort |
| 238 | Product of Array Except Self | Medium | Prefix & Suffix Products |
| 560 | Subarray Sum Equals K | Medium | Prefix Sum & HashMap |

### Two Pointers

| ID | Problem | Difficulty | Core Pattern |
| --- | --- | --- | --- |
| 125 | Valid Palindrome | Easy | Converging Pointers |
| 167 | Two Sum II (Sorted) | Medium | Two Pointers (Sorted Data) |
| 15 | 3Sum | Medium | Fixed Element Pivot & Two Pointers |

---

## Algorithmic Patterns

Recognizing the underlying blueprint of a problem is the primary objective of this repository. Below are the core patterns mastered thus far:

* **HashMap & Complements:** Identifying pairs that satisfy a specific constraint (e.g., *Two Sum*).
* **HashSet Membership:** Achieving constant-time lookup for historical data verification.
* **Frequency Counting:** Utilizing `getOrDefault(key, 0) + 1` for efficient element tracking.
* **Sorted Key Grouping:** Lexicographical sorting to group variants (e.g., Anagrams).
* **Bucket Sort:** Mapping frequencies to indices for optimized top-K retrievals.
* **Prefix / Suffix Operations:** Precomputing running totals to bypass nested iterations.
* **Converging Pointers:** Utilizing opposite-end traversal on sorted sequences for paired targets.

---

## Technical Stack

* **Language:** Java
* **Environment:** IntelliJ IDEA
* **Evaluation Platform:** LeetCode

---

*Continuous Integration: This repository is actively maintained and updated as new algorithmic patterns are explored and mastered.*