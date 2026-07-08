# 📚 Library Management System

A complete full-stack web application for efficient library management and book issuance operations. This project combines a robust **Spring Boot** backend API with a modern **Angular** frontend to provide a seamless library management experience.

---

## 🎯 Project Overview

The Library Management System is designed to streamline library operations including:

- 📖 **Book Inventory Management** - Add, update, and manage library books
- 👥 **Member Management** - Register and manage library members
- 🔍 **Search & Filter** - Advanced search capabilities for finding books
- 🔐 **Secure Access** - Authentication and authorization with Spring Security
- 📱 **Responsive UI** - Modern Material Design interface with Bootstrap

---

## 🏗️ Project Structure

```
Library_Management_System/
├── LibraryanagementSystemBackEnd/    # Spring Boot Backend
│   ├── src/
│   ├── pom.xml                      # Maven dependencies
│   └── mvnw                         # Maven wrapper
└── library-management-ui 2/         # Angular Frontend
    ├── src/
    ├── package.json                 # NPM dependencies
    └── angular.json                 # Angular configuration
```

---

## 💻 Tech Stack

### **Backend**
| Technology | Version | Purpose |
|-----------|---------|---------|
| **Java** | 17 | Core language |
| **Spring Boot** | 4.1.0 | Web framework & REST API |
| **Spring Data JPA** | Latest | Database ORM |
| **Spring Security** | Latest | Authentication & Authorization |
| **MySQL** | 8.0+ | Relational database |
| **Lombok** | Latest | Reduce boilerplate code |
| **Maven** | 3.8+ | Build & dependency management |

### **Frontend**
| Technology | Version | Purpose |
|-----------|---------|---------|
| **Angular** | 21.2.17 | Frontend framework |
| **TypeScript** | 5.9.2 | Programming language |
| **Angular Material** | 21.2.14 | UI component library |
| **Bootstrap** | 5.3.8 | Responsive design |
| **RxJS** | 7.8.0 | Reactive programming |
| **npm** | 10.9.2 | Package manager |

---

## 🚀 Getting Started

### **Prerequisites**
- **Java JDK 17+** - [Download](https://www.oracle.com/java/technologies/downloads/#java17)
- **Node.js & npm** (Node 18+) - [Download](https://nodejs.org/)
- **MySQL Server** (8.0+) - [Download](https://dev.mysql.com/downloads/mysql/)
- **Git** - [Download](https://git-scm.com/)

---

## 📋 Backend Setup

### **Step 1: Install Required Dependencies**

The backend requires the following dependencies (already configured in `pom.xml`):

```
✓ Spring Boot Starter Data JPA
✓ Spring Boot Starter Security
✓ Spring Boot Starter Validation
✓ Spring Boot Starter Web MVC
✓ Lombok (Annotation processing)
✓ MySQL Connector/J
✓ Spring Boot DevTools
✓ Testing dependencies
```

### **Step 2: Configure Database**

1. **Create a MySQL database:**
   ```sql
   CREATE DATABASE library_management;
   ```

2. **Update `application.properties`** in `LibraryanagementSystemBackEnd/src/main/resources/`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/library_management
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

### **Step 3: Build & Run Backend**

Navigate to the backend directory:
```bash
cd LibraryanagementSystemBackEnd
```

**Option A: Using Maven Wrapper (Recommended)**
```bash
./mvnw clean install
./mvnw spring-boot:run
```

**Option B: Using Maven** (if installed globally)
```bash
mvn clean install
mvn spring-boot:run
```

The backend will start on `http://localhost:8080`

---

## 🎨 Frontend Setup

### **Step 1: Install Node Modules**

Navigate to the frontend directory:
```bash
cd "library-management-ui 2"
```

**Install all dependencies:**
```bash
npm install
```

⚠️ **Important:** Node modules are not included in the repository. You must run `npm install` to download all required packages.

### **Step 2: Run Development Server**

```bash
npm start
```

Or alternatively:
```bash
ng serve
```

The frontend will be available at `http://localhost:4200`

### **Step 3: Build for Production**

```bash
npm run build
```

The build artifacts will be stored in `dist/` directory.

---

## 🔧 API Endpoints

The backend provides RESTful API endpoints for:

- **Authentication** - Login and user management
- **Books** - CRUD operations for library books
- **Members** - Member registration and management
- **Issuance** - Book issuance and return tracking

All endpoints are secured with Spring Security. Default API base URL: `http://localhost:8080/api`

---

## 📝 Development Notes

### **⚠️ Frontend - Work in Progress**

The frontend application is **still under development**. The following features need implementation:

#### **Pending Features:**
- [ ] **Issue Book** - Complete the book issuance workflow
- [ ] **Issue History** - Display and track book issuance history
- [ ] **UI/UX Improvements** - Design refinements and responsiveness enhancements
- [ ] **Additional Components** - Reporting and analytics dashboard

#### **Current Status:**
- ✅ Basic project structure in place
- ✅ Angular Material integration complete
- ✅ Bootstrap styling configured
- ✅ API integration foundation ready
- 🔄 Core features being developed

### **Backend - Production Ready**

The backend API is fully functional with:
- ✅ Database schema and migrations
- ✅ RESTful endpoints implemented
- ✅ Security and authentication
- ✅ Error handling and validation

---

## 📦 Key Dependencies

### **Backend Dependencies**

```xml
<!-- Spring Boot Starters -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- Database -->
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>

<!-- Productivity -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>

<!-- Testing -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-test</artifactId>
    <scope>test</scope>
</dependency>
```

### **Frontend Dependencies**

```json
{
  "@angular/core": "^21.2.0",
  "@angular/material": "^21.2.14",
  "bootstrap": "^5.3.8",
  "rxjs": "~7.8.0",
  "typescript": "~5.9.2"
}
```

---

## 🛠️ Development Workflow

### **Running Both Services Simultaneously**

**Terminal 1 - Backend:**
```bash
cd LibraryanagementSystemBackEnd
./mvnw spring-boot:run
```

**Terminal 2 - Frontend:**
```bash
cd "library-management-ui 2"
npm start
```

Both services should now be running:
- Backend API: `http://localhost:8080`
- Frontend UI: `http://localhost:4200`

---

## 🧪 Testing

### **Backend Unit Tests**
```bash
cd LibraryanagementSystemBackEnd
./mvnw test
```

### **Frontend Tests**
```bash
cd "library-management-ui 2"
npm test
```

---

## 📚 API Documentation

### **Example Request - Get All Books**
```bash
curl -X GET http://localhost:8080/api/books \
  -H "Authorization: Bearer <token>" \
  -H "Content-Type: application/json"
```

### **Example Request - Create New Book**
```bash
curl -X POST http://localhost:8080/api/books \
  -H "Authorization: Bearer <token>" \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Java Programming",
    "author": "Gosling",
    "isbn": "123456789",
    "quantity": 5
  }'
```

---

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

---

## 📋 Project Roadmap

### **Phase 1: Core Development** (Current)
- [x] Backend API structure
- [x] Database schema
- [x] Authentication system
- [x] Frontend project setup
- [ ] Issue book feature
- [ ] Issue history tracking

### **Phase 2: Enhancement**
- [ ] Advanced search filters
- [ ] Book recommendations
- [ ] Fine/penalty management
- [ ] Email notifications

### **Phase 3: Optimization**
- [ ] Performance optimization
- [ ] Mobile app development
- [ ] Analytics dashboard
- [ ] Admin panel improvements

---

## 🐛 Troubleshooting

### **Backend Issues**

**Issue:** `Connection refused: Cannot connect to database`
- **Solution:** Ensure MySQL is running and credentials in `application.properties` are correct

**Issue:** `Lombok annotation processing error`
- **Solution:** Enable annotation processing in your IDE (IntelliJ: Settings → Compiler → Annotation Processors → Enable)

### **Frontend Issues**

**Issue:** `npm ERR! Cannot find module`
- **Solution:** Run `npm install` to download all dependencies

**Issue:** `Port 4200 already in use`
- **Solution:** Run `ng serve --port 4300` to use a different port

**Issue:** `CORS errors when calling backend API`
- **Solution:** Ensure backend is configured with proper CORS headers

---

## 📞 Support & Contact

For questions or issues, please:
- Check existing issues on GitHub
- Create a new GitHub issue with detailed description
- Include error logs and reproduction steps

---

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

---

## 👨‍💻 Author

**Pawan Jamkhande**
- GitHub: [@PawanJamkhande](https://github.com/PawanJamkhande)

---

## 🎉 Acknowledgments

- Spring Boot community
- Angular team
- Material Design
- Bootstrap framework

---

<div align="center">

**⭐ If you found this project helpful, please consider giving it a star!**

Made with ❤️ for library management enthusiasts

</div>
