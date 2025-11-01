<!-- 🧮 Animated Header -->

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=26&duration=3000&pause=800&color=FF69B4&center=true&vCenter=true&width=800&lines=🧮+Arbitrary+Precision+Arithmetic+in+Java;Implementing+Huge+Integers+Using+ArrayLists;Data+Structures+%7C+Algorithm+Design+%7C+OOP+💻" alt="Typing Animation" />
</p>

---

# 🧩 Overview

This project implements **arbitrary-precision arithmetic** (addition, subtraction, and comparison) in Java using **ArrayLists** to store and manipulate very large integers far beyond the range of standard data types like `int` and `long`.

It simulates the logic of manual arithmetic digit by digit while leveraging **object-oriented design** and **data structures** for efficient computation.

Think of it as a **custom-built version of Java’s BigInteger**, coded entirely from scratch.

---

## ⚙️ Key Features

| Feature                       | Description                                                           |
| ----------------------------- | --------------------------------------------------------------------- |
| ➕ **Addition**                | Performs digit-by-digit addition using carry logic.                   |
| ➖ **Subtraction**             | Handles large number subtraction with borrowing.                      |
| ⚖️ **Comparison**             | Compares numbers of arbitrary size and sign.                          |
| 🔢 **Dynamic Representation** | Uses `ArrayList<Integer>` to store each digit for flexible precision. |
| 🧱 **Object-Oriented Design** | Encapsulates logic in a `HugeInteger` class with modular methods.     |
| 🧮 **Mathematical Accuracy**  | Correctly manages sign, leading zeros, and magnitude comparison.      |

---

## 🧠 Technical Concepts

| Concept                            | Explanation                                                                 |
| ---------------------------------- | --------------------------------------------------------------------------- |
| 💾 **Arbitrary Precision**         | No fixed limit on size — integers can grow dynamically.                     |
| 🧱 **ArrayList as Storage**        | Each element stores a single digit, allowing digit-wise arithmetic.         |
| 🔁 **Iteration & Control Flow**    | Loops manage carry, borrow, and alignment for multi-digit operations.       |
| 🧮 **String Parsing & Validation** | Converts user input into digit lists for processing.                        |
| ⚙️ **Encapsulation & Abstraction** | Arithmetic logic is neatly contained within reusable class methods.         |
| 🔍 **Algorithmic Efficiency**      | Optimized for low-overhead operations and early termination in comparisons. |

---

## 🧩 Data Structures Used

| Data Structure                        | Role                                                                          |
| ------------------------------------- | ----------------------------------------------------------------------------- |
| 📋 **`ArrayList<Integer>`**           | Core structure that stores digits in reverse order (least significant first). |
| 🔁 **Iterators / Loops**              | Traverse the list to perform digit-wise operations.                           |
| 📚 **Strings**                        | Used for user input and conversion between text and numeric representations.  |
| ⚙️ **Custom Objects (`HugeInteger`)** | Encapsulates data and methods to perform arithmetic cleanly.                  |

---

## 🧰 Class Structure

| Class                 | Description                                                                   |
| --------------------- | ----------------------------------------------------------------------------- |
| **`HugeInteger`**     | Represents large integers and supports addition, subtraction, and comparison. |
| **`HugeIntegerTest`** | JUnit test file verifying correctness of each arithmetic operation.           |
| **`Main.java`**       | Demonstrates creating `HugeInteger` objects and performing computations.      |

---

## 💻 Example Usage

**Input:**

```java
HugeInteger num1 = new HugeInteger("999999999999999999");
HugeInteger num2 = new HugeInteger("1");

HugeInteger result = num1.add(num2);
System.out.println("Sum: " + result);
```

**Output:**

```
Sum: 1000000000000000000
```

**Subtraction Example:**

```java
HugeInteger a = new HugeInteger("1000");
HugeInteger b = new HugeInteger("999");
System.out.println("Difference: " + a.subtract(b));
```

**Output:**

```
Difference: 1
```

---

## 🧩 Algorithm Design

### 🔢 Addition Algorithm

1. Reverse both numbers for least-significant-digit-first processing.
2. Loop through both lists adding corresponding digits.
3. Carry over any overflow (`> 9`).
4. Append carry if remaining after loop.

### ➖ Subtraction Algorithm

1. Compare numbers to determine sign.
2. Perform digit-by-digit subtraction with borrow logic.
3. Remove leading zeros.

### ⚖️ Comparison Algorithm

1. Compare lengths.
2. If equal, compare digit by digit from most significant to least.

---

## 🧪 Testing

Includes **JUnit test cases** verifying correctness for:

* Single-digit and multi-digit addition
* Borrow propagation in subtraction
* Handling of negative and zero values
* Comparison edge cases
* Input validation

---

## 🧭 Learning Outcomes

✅ Strengthened understanding of **data structure design** (ArrayLists)
✅ Practiced **algorithm development for arithmetic computation**
✅ Improved **modular programming and class design**
✅ Learned how to simulate low-level **CPU-like operations (carry/borrow logic)**
✅ Enhanced understanding of **abstraction and reusability in OOP**

---

## 💼 Technical Skills

| Category                    | Skills Demonstrated                       |
| --------------------------- | ----------------------------------------- |
| 💻 **Programming**          | Java, Object-Oriented Design              |
| 🧮 **Algorithms**           | Digit-wise arithmetic, carry/borrow logic |
| 🧱 **Data Structures**      | ArrayList, Object encapsulation           |
| 🧩 **Problem Solving**      | Abstraction, modularization, code reuse   |
| ⚙️ **Software Engineering** | Class design, testing, input handling     |

---

## 🌟 Future Enhancements

* ➗ Implement **division and multiplication** operations.
* 🔢 Add **negative number handling** for full arithmetic coverage.
* 🧮 Integrate with **graphical calculator GUI**.
* 📊 Include **performance analysis** for extremely large inputs.

---

## 👩🏻‍💻 Author

**Mahnoor Iftikhar**
📍 *Pacific Lutheran University* – CS & Economics Double Major, Data Science Minor
💡 Learning about **data structures, mathematical computing, and scalable software systems.**

📫 [LinkedIn](https://www.linkedin.com/in/mahnooriftikharrr)
📧 [mahnooriftikharr@gmail.com](mailto:mahnooriftikharr@gmail.com)

