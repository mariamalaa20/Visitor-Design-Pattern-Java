# Visitor Pattern: Product Pricing System

A Java implementation of the **Visitor Design Pattern** to dynamically apply pricing rules—such as discounts, taxes, and warranty fees—to various product types like electronics, clothing, and food.

---

##  Features

*  **Visitor Pattern**: Clean separation between operations and object structure
*  **Easily Extensible**: Add new pricing rules or product types with minimal changes
*  **Clear Output**: Prints applied pricing logic for each product
*  **Type Safety**: Ensures compatibility between visitors and products at compile time

---

##  Requirements

* Java 11 or higher
* Any standard Java IDE (e.g., IntelliJ IDEA, Eclipse) or terminal-based setup

---

##  Installation & Run

```bash
# Clone the repository
git clone https://github.com/yourusername/visitor-pattern-pricing.git

# Navigate to project folder
cd visitor-pattern-pricing

# Compile and run
javac Main.java
java Main
```

---

##  Project Structure

```bash
visitor-pattern-pricing/
├── IProduct.java              # Common product interface
├── Electronics.java           # Electronics product class
├── Clothing.java              # Clothing product class
├── Food.java                  # Food product class
├── IVisitor.java              # Visitor interface for pricing rules
├── ProductPriceVisitor.java  # Concrete visitor applying pricing logic
└── Main.java                  # Entry point with demo execution
```

---

##  Usage

### 1. Create Products

```java
IProduct electronics = new Electronics();
```

### 2. Apply Pricing

```java
electronics.accept(new ProductPriceVisitor());
```

###  Output

```text
Electronics Product: Warranty fee added.
```
