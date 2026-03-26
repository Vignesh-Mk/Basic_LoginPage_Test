# Login Test Automation (Java + Selenium + Maven)

## 📌 Overview
This repository contains a **basic Login Automation Test** project built using **Java**, **Selenium WebDriver**, and **Maven**.

The purpose of this project is purely **learning and understanding automation testing fundamentals**. As this is my first hands-on implementation using Java Selenium with Maven, the project scope is intentionally **simple and minimal**. The focus was on understanding how automation frameworks are structured rather than building a production-ready test suite.

The project automates a website login workflow and demonstrates synchronization techniques to handle dynamic webpage loading.

---

## 🎯 Project Goals
- Understand Selenium WebDriver basics
- Learn Maven project structure and dependency management
- Automate a login workflow
- Handle dynamic page loading
- Use explicit waits instead of fixed delays
- Gain foundational knowledge for building scalable automation frameworks

---

## 🛠️ Tech Stack
- **Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Build Tool:** Maven
- **Testing Type:** UI Automation Testing
- **IDE:** (Add your IDE here – IntelliJ IDEA / Eclipse)

---

## 📂 Project Structure
```
LoginTestProject
│
├── src
│   ├── main/java
│   │   └── (Driver / Utility classes)
│   │
│   └── test/java
│       └── LoginTest.java
│
├── pom.xml
└── README.md
```

---

## ⚙️ Features Implemented
- Browser automation using Selenium WebDriver
- Automated login validation
- Element interaction using locators
- Explicit wait handling using:
  - `WebDriverWait`
  - `ExpectedConditions`
- Adaptive execution independent of webpage loading speed
- Maven-based dependency management

---

## ⏱️ Synchronization Approach
Instead of using hard-coded delays such as `Thread.sleep`, this project uses **Explicit Waits**.

### Tools Used
- `WebDriverWait`
- `ExpectedConditions`

### Benefits
- More reliable test execution
- Reduced flaky tests
- Better handling of dynamic elements
- Improved performance

---

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/your-repository-name.git
```

### 2. Import as Maven Project
Open the project in your IDE and import it as a **Maven Project**.

### 3. Install Dependencies
Maven will automatically download dependencies from `pom.xml`.

(Optional manual install)
```bash
mvn clean install
```

### 4. Run Tests
Run the test class directly from the IDE or using:

```bash
mvn test
```

---

## 📘 Learning Outcomes
- Setting up Selenium with Maven
- Understanding WebDriver workflow
- Managing dependencies using `pom.xml`
- Implementing explicit waits
- Creating a basic automation testing structure

---

## 🔮 Future Improvements
- Implement Page Object Model (POM)
- Add TestNG or JUnit framework
- Cross-browser testing support
- Configuration management
- Test reporting (Extent Reports / Allure)
- CI/CD integration (GitHub Actions / Jenkins)

---

## 📄 Note
This project is intentionally simple and was created for **learning and experimentation purposes** to understand automation testing concepts using Java Selenium and Maven.

---
