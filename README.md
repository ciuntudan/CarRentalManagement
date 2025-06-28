# 🚗 CarRental Management System (Java)

A powerful Java application for managing car rental contracts, vehicle inventories, and client data. It showcases advanced Java SE concepts including:

- Object-Oriented Programming (inheritance, interfaces, composition, polymorphism)  
- Serialization & Deserialization of contract objects  
- Java Collections Framework for managing lists of vehicles and clients  
- Multi-threaded TCP server with ExecutorService handling multiple clients  
- JDBC integration with SQLite for persistent contract storage  
- JSON-based external communication  
- Functional programming (Java Streams + lambdas) for offer filtering  
- Exception handling, I/O Streams for report generation, and more

---

## 🚀 Features

- **Client management** (add, update, list clients)
- **Vehicle management** (list, sort, filter by type / fuel / price)
- **Rental contracts** with start/end date and total price
- **TCP server**:
    - accepts multiple clients simultaneously using a thread pool
    - receives serialized `Contract` objects
    - sends confirmation messages back
- **Standalone TCP**:
    - single client/server version for testing
- **UDP**:
    - simple datagram-based contract messages (optional)
- **Database**:
    - persists clients & contracts in SQLite
- **Functional filters**:
    - lambda streams to search, sort, and filter vehicles
- **JSON**:
    - encodes/decodes external messages
- **Reactive streams**:
    - simulated contract broadcast to subscribers
- **Exception-safe** with try/catch and `throws` patterns

---

