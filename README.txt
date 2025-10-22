Instructions:
1. Import this project into your IDE or unpack and run: mvn spring-boot:run
2. Configure PostgreSQL in src/main/resources/application.properties
3. Create roles in DB:
   INSERT INTO roles (name) VALUES ('ROLE_USER');
   INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
4. Register a user via POST /auth/register or add user and assign role in DB.
5. Open http://localhost:8080/login.html to log in and http://localhost:8080/index.html to view categories.
