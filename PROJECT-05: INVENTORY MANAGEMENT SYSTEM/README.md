# 📦 Inventory Management System in Java

This project is a **console-based Inventory Management System** developed using **Core Java**.  
It allows a user to **add, remove, and view items** in an inventory while maintaining accurate records of stock.

This project is part of my **step-by-step Java learning journey**, where each project builds upon concepts learned in previous ones.

---

## 📌 Project Overview

Managing inventory is a fundamental requirement for many real-world applications such as:
- Shops
- Warehouses
- Small businesses
- Stock tracking systems

This project simulates a **basic inventory system** where the user can interact through a menu-driven console interface.

---

## ⚙️ Features Implemented

- Add new items to inventory (name, quantity, price)
- Remove items from inventory by name
- View all items currently in inventory
- Continuous menu until user exits
- Displays inventory status after each operation

---

## 🧠 How the System Works

1. The program starts and displays a menu.
2. The user selects an operation:
   - Add item
   - Remove item
   - View items
   - Exit
3. Based on the user’s choice:
   - Data is taken using `Scanner`
   - Inventory is updated accordingly
4. The program continues running until the user chooses to exit.

---

## 🗂️ Project Structure
Project-05-Inventory-Management-System
├── src
│ └── com
│ └── inventory
│ ├── Item.java
│ ├── Inventory.java
│ └── InventorySystem.java
└── README.md


> 📌 Note:  
> Folder structure matches the package name `com.inventory`, which is required for Java programs using packages.

---

## 📄 File-by-File Code Explanation

### 📘 1. Item.java (Model Class)

**Purpose:**  
Represents a single inventory item.

**Responsibilities:**
- Stores item name
- Stores quantity
- Stores price
- Provides getter and setter methods
- Overrides `toString()` for readable output

**Key Concepts Used:**
- Encapsulation
- Constructors
- Getter & Setter methods

This class contains **only data**, no business logic.

---

### 📙 2. Inventory.java (Generic Inventory Manager)

**Purpose:**  
Manages the collection of inventory items.

**Responsibilities:**
- Stores items using `ArrayList`
- Adds new items
- Removes existing items
- Displays all items

**Key Concepts Used:**
- **Generics (`<T>`)**
- Collections Framework (`List`, `ArrayList`)
- Reusable class design

Using generics makes this class flexible and reusable for other object types in the future.

---

### 📕 3. InventorySystem.java (Main Class)

**Purpose:**  
Acts as the **entry point** of the application.

**Responsibilities:**
- Displays menu
- Takes user input
- Calls appropriate inventory operations
- Controls program flow using loops and switch-case

**Key Concepts Used:**
- `Scanner` for input handling
- `while` loop
- `switch-case`
- Object interaction between classes

Only this file is executed to run the program.

---

## ▶️ Execution Flow
InventorySystem (main)
↓
User selects option
↓
Inventory methods called
↓
Inventory updated / displayed
↓
Menu shown again


---

## ▶️ How to Compile and Run

### Step 1: Go to the `src` directory
### Step 2: Compile the code
```bash
javac com\inventory\*.java
Step 3: Run the program
java com.inventory.InventorySystem
