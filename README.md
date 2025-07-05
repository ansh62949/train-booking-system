# 🚆 Train Booking System (IRCTC Backend Clone)

A RESTful backend application built using **Java**, **Spring Boot**, and **MySQL** that simulates core functionalities of a train reservation system like IRCTC. It supports user registration, train management, ticket booking, and cancellation workflows.

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Postman** (for API testing)



## 🔧 Configuration

Update your `application.properties` with your local MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/train_booking_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
🚀 Features
✅ User registration and authentication

🚉 Train creation and management

🎫 Ticket booking and cancellation

📊 Booking history and train availability

🔐 Secure endpoints with request validation

📬 API Endpoints
Method	Endpoint	Description
POST	/users/register	Register a new user
GET	/trains	List all trains
POST	/bookings	Book a ticket
DELETE	/bookings/{id}	Cancel a booking
Use Postman or any REST client to test the endpoints.

🧪 Running the App
Clone the repo:

bash
git clone https://github.com/ansh62949/train-booking-system.git
cd train-booking-system
Start MySQL and create the database:

sql
CREATE DATABASE train_booking_db;
Run the Spring Boot app from IntelliJ or:

bash
./mvnw spring-boot:run
📌 Future Enhancements
JWT-based authentication

Admin dashboard

Email notifications

Swagger API documentation
