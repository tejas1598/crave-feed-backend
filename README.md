# Crave-Feed Backend

**Project Description**
Crave-Feed is a video-first food commerce platform designed to bridge the gap between content discovery and transaction. It addresses the friction in current food delivery models where users view content on social media but lack a direct path to purchase.

**Core Value Proposition**
The system integrates short-form video content with a verified transactional layer, allowing users to move from "Watching" to "Ordering" in a single interface without context switching.

## Key Architectural Pillars

### 1. Verified Linking System
* **Mechanism:** Implements a strict foreign-key relationship between media assets (`Reels`) and inventory items (`MenuItem`).
* **Benefit:** Ensures data integrity, preventing broken links or price discrepancies between the video feed and the point of sale.

### 2. Algorithmic Upselling
* **Logic:** Utilizes a rules-based "Category Matcher" engine.
* **Function:** Analyzes the primary item in the cart (e.g., Main Course) and programmatically suggests complementary high-margin items (e.g., Beverages/Sides) to maximize Average Order Value (AOV).

### 3. Real-Time Logistics Engine
* **Technology:** Implements WebSocket (STOMP protocol) connections for instant bi-directional communication.
* **Application:** Powering a "Live Kitchen Dashboard" for restaurant partners, eliminating the need for manual page refreshes and reducing order acceptance latency.

### 4. Smart Subsidy Revenue Model
* **Strategy:** A dynamic commission structure where platform fees charged to vendors are algorithmically reapplied to subsidize user delivery costs, improving conversion rates while maintaining unit economics.

## Technical Stack

* **Backend Framework:** Java 17, Spring Boot 3.2
* **Database:** PostgreSQL (Relational Data Persistence)
* **API Protocol:** REST & WebSockets
* **Version Control:** Git

## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone [https://github.com/tejas1598/crave-feed-backend.git](https://github.com/tejas1598/crave-feed-backend.git)

2. **Database Configuration**
   * Ensure PostgreSQL is running.
   * Create a database named `crave_feed_db`.
   * Configure `src/main/resources/application.properties` with local credentials.
     
3. **Build and Run**
   ```bash
   mvn spring-boot:run
