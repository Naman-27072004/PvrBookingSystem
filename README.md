# 🎬 PVR Movie Ticket Booking System (Java)

A desktop-based **Movie Ticket Booking System** developed using **Java (Swing)** and **MySQL**, inspired by real-world PVR cinema booking workflows.  
The application allows users to log in, select movies, choose seats, and manage bookings through an interactive GUI.

---

## 🚀 Features

- 🔐 User Login System
- 🎥 Movie Selection Screen
- 💺 Seat Selection Interface
- 🧾 Booking Dashboard
- 🖥️ Java Swing-based GUI
- 🗄️ MySQL Database Connectivity
- 🧩 DAO–DTO Architecture

---

## 🛠️ Technologies Used

- **Java (JDK 8+)**
- **Java Swing (GUI)**
- **MySQL**
- **JDBC (MySQL Connector)**
- **Eclipse / IntelliJ IDEA**

---

## 📁 Project Structure
```text
PvrBookingSystem/
│
├── src/
│ └── com/jims/
│ ├── dao/ # Database access logic
│ ├── dto/ # Data Transfer Objects
│ └── ui/ # Swing UI Screens
│
├── bin/ # Compiled .class files
├── images/ # Movie posters & UI assets
├── lib/ # MySQL JDBC Connector
└── README.md
```

---

## 🧑‍💻 Key Modules

- **Login Screen** – User authentication
- **Dashboard** – Movie overview
- **Seat Screen** – Seat availability & selection
- **DAO Layer** – Handles database operations
- **DTO Layer** – Transfers data between layers

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/PvrBookingSystem.git
```
### 2️⃣ Database Setup
- Create a MySQL database
- Import required tables (users, seats, bookings, etc.)
- Update database credentials in:
```bash
src/com/jims/dao/DB.java
```
### 3️⃣ Add MySQL Connector
Ensure the following JAR is added to your classpath:
```bash
lib/mysql-connector-j-9.5.0.jar
```
### 4️⃣ Run the Project
- Open the project in Eclipse / IntelliJ
- Run SplashScreen.java or Login.java

---

## 🎯 Use Case
- Academic Mini Project
- Java Swing Practice
- DBMS + Java Integration
- Desktop Application Development

---

## 🔮 Future Enhancements
- Online Payment Integration
- Admin Panel
- Movie Schedule Management
- Booking History
- Email / SMS Confirmation

---

## 👨‍🎓 Author
- Naman Gupta
- MCA Student | Java Developer

---

## 📜 License
This project is for educational purposes only.
