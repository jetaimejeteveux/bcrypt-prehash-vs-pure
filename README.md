
---
```markdown
# 🔐 Prehashed Bcrypt Password Hashing (SHA-512 + Bcrypt)

This project explores the security enhancement of password hashing by **prehashing** user passwords with **SHA-512** before applying **Bcrypt**. This is particularly useful to overcome Bcrypt's native limitation of **72-byte password length**.

---

## 📖 Research Background

### 🧩 Problem Statement

Bcrypt only processes the first **72 bytes** of a password, which directly conflicts with the **NIST** guidelines that recommend supporting longer, more secure passphrases. This limitation can potentially reduce the effectiveness of password security in systems that store credentials using bcrypt.

### 📌 Research Question

> **How can we overcome the 72-byte limitation of the Bcrypt algorithm while maintaining secure and efficient password hashing?**

### 🧪 Scope of the Study

To ensure focused analysis and measurable results, this research applies the following constraints:

1. Uses a dataset of **3,000 most common passwords** (secondary data).
2. Passwords are sourced from the open-source security site [Openwall](https://openwall.com).
3. Passwords include combinations of **letters and numbers**.
4. The **cost factor** for bcrypt is set to **10** (commonly used in production systems).

### 🎯 Research Goal

The objective is to **implement SHA-512 as a prehashing layer** before bcrypt, allowing secure support for longer password inputs while evaluating its **performance impact** and **resilience against attacks** using tools like **Hashcat**.

---

## 🔧 Features

- Prehashes password with **SHA-512** before applying **Bcrypt**.
- Pure Java implementation (no third-party crypto libraries).
- Designed as a basic research proof-of-concept.
- Easily extensible and readable code structure.

---

## 📁 Project Structure

belajar-bcrypt-from-scratch/
├── .idea/
├── out/
├── src/
│   └── SHA512/
│       ├── Constants.java
│       ├── Formula.java
│       └── SHA512.java
│   
├── Bcrypt.java
├── Main.java
├── .gitignore
├── belajar-bcrypt-from-scratch.iml
└── README.md
```

---

## 🚀 Getting Started

1. **Clone the repository**
   ```bash
   git clone git@github.com:your-username/belajar-bcrypt-from-scratch.git
   cd belajar-bcrypt-from-scratch
   ```

2. **Open with IntelliJ IDEA** or compile manually:
   ```bash
    javac src/SHA512/*.java src/Main.java
    java -cp src Main
   ```

---

## 📈 Example Output

```
Original password: mySuperLongPasswordThatExceeds72BytesAndKeepsGoing...
Prehashed (SHA-512): b109f3...
Final Hashed (Bcrypt): $2a$10$M6Z7NYl...
```

---

## 🧪 Tools Used

- Java (JDK 11+)
- [Hashcat](https://hashcat.net/hashcat/) for offline brute-force testing
- Dataset: [Openwall password list](https://openwall.com/wordlists/)

