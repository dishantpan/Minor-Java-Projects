# 🧠 Memory Game (Java)

A simple **console-based Memory Game** built in Java.  
This two-player style game focuses on logic, memory, and array handling.

The goal of the game is to find all matching pairs by flipping two cards at a time.

---

## 🎮 Game Overview
- The game consists of **8 cards (4 matching pairs)**
- Cards are placed face down and shuffled randomly
- Players select two card positions per turn
- If the cards match, they stay visible
- If not, they are flipped back
- The game ends when all pairs are found

---

## 🗂️ Game Board Layout
The board contains **slots numbered from 0 to 7**.
| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |

As the game progresses, flipped cards reveal their values.

---

## 🧠 Key Concepts Used
- Arrays and ArrayLists  
- Random shuffling  
- Conditional logic  
- Loops  
- Game state tracking  

---

## ⚙️ How the Game Works
- Card values are stored and shuffled using an `ArrayList<String>`
- The visible board is maintained using a `String[]`
- A `boolean[]` array keeps track of flipped cards
- After every move, the board updates to reflect the current state

---

## 📚 What I Learned
- Managing game state using multiple data structures  
- Implementing comparison logic between selections  
- Updating a dynamic console-based board  
- Writing clean and readable Java logic  

---

## 🛠️ Tech Stack
- Java  
- Console / Terminal  

---

## 🚀 Notes
This project was built as part of guided Java learning and enhanced with personal understanding.

More Java projects will be added to this repository regularly.
