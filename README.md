# 🍔 Crave-Feed Backend

**Project Description**
Crave-Feed is a video-first food commerce platform designed to bridge the gap between content discovery and transaction. It addresses the friction in current food delivery models where users view content on social media but lack a direct path to purchase.

**Core Value Proposition**
The system integrates short-form video content with a verified transactional layer, allowing users to move from "Watching" to "Ordering" in a single interface without context switching.

---

## 🏗️ Key Architectural Pillars

### 1. Verified Linking System (Implemented)
* **Mechanism:** Implements a strict foreign-key relationship (`@OneToMany`) between media assets (`Reels`) and inventory items (`Restaurant`).
* **Benefit:** Ensures data integrity, preventing broken links or price discrepancies between the video feed and the point of sale.

### 2. Scalable REST Architecture (Implemented)
* **Design:** Built using the **Controller-Service-Repository** pattern to ensure separation of concerns.
* **Benefit:** Modular codebase that allows for easy expansion of features (like adding new delivery partners or payment gateways).

### 3. Future Roadmap (Planned Features)
* **Real-Time Logistics Engine:** Plans to implement WebSocket (STOMP) for live kitchen dashboards.
* **Algorithmic Upselling:** Developing a "Category Matcher" engine to suggest high-margin sides based on cart contents.

---

## 🛠️ Technical Stack
* **Backend Framework:** Java 17, Spring Boot 3
* **Database:** PostgreSQL (Relational Data Persistence)
* **API Protocol:** RESTful Web Services
* **ORM:** Hibernate (Spring Data JPA)
* **Version Control:** Git

---

## 🔌 API Endpoints (Live)

### 🏠 Restaurants
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/restaurants` | Register a new restaurant |
| `GET` | `/api/restaurants` | Get all restaurants |

### 🍔 Menu Items
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/menu/{restaurantId}` | Add food to a restaurant |
| `GET` | `/api/menu/{restaurantId}` | Get menu for a restaurant |

### 🎬 Video Reels
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/reels/{restaurantId}` | Upload a promotional video |
| `GET` | `/api/reels` | Get the video feed |

---

## ⚙️ Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone [https://github.com/tejas1598/crave-feed-backend.git](https://github.com/tejas1598/crave-feed-backend.git)

2. **Database Configuration**
   * Ensure PostgreSQL is running.
   * Create a database named `crave_feed_db`.
   * Open `src/main/resources/application.properties` and update the `username` and `password` with your local PostgreSQL credentials.

3. **Build and Run**
   * Open the project in your IDE (IntelliJ IDEA) or Terminal.
   * Run the application using Maven:
   ```bash
   mvn spring-boot:run
