# ☕ Java Projects by Samay Jain

Welcome to my Java portfolio! This repository contains a collection of my Java projects, ranging from basic console applications to more complex algorithms and file handling systems. I am constantly adding new projects as I master new concepts.

## 👨‍💻 About Me
* **Name:** Samay Jain
* **Goal:** To become proficient at java.
* **Focus:** Core Java, Object-Oriented Programming (OOP), Data Structures & Algorithms.

---

## 📚 Project Index

| # | Project Name | Type | Key Concepts | Status |
|:-:|:---|:---|:---|:---:|
| 1 | **[Personal Notes Manager](#1-personal-notes-manager-terminal)** | Console App | File I/O, RandomAccessFile, Exceptions | ✅ Completed |
| 2 | *Coming Soon...* | - | - | 🚧 In Progress |
| 3 | *Coming Soon...* | - | - | ⏳ Planned |

---

## 🚀 Projects in Detail

### 1. Personal Notes Manager (Terminal)
**Location:** `/01_Personal_Notes_App`

A robust, menu-driven application that allows users to write, read, and delete personal notes directly from the terminal. This project demonstrates persistent data storage without using a database.

**✨ Features:**
* **Smart Append:** Uses `RandomAccessFile` to locate the end of the file and append notes on new lines automatically.
* **Data Persistence:** Notes are saved to `Personal_Notes.txt` and survive after the program closes.
* **Wipe Function:** Includes a "Clear All" feature that safely truncates the file to 0 bytes.
* **Error Handling:** Custom `WrongInputException` prevents the app from crashing on invalid inputs.

**🛠️ Tech Stack:**
* Java IO (`RandomAccessFile`, `File`)
* Java Util (`Scanner`)
* Custom Exceptions

**How to Run:**
```bash
cd 01_Personal_Notes_App
javac Simple_File.java
java Simple_File