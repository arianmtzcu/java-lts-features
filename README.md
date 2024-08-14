# Java LTS Features Examples
This repository showcases examples of new features introduced in each Long-Term Support (LTS) version of Java, from Java 8 to the most current version. The goal is to provide clear and concise examples that demonstrate the power and flexibility of the language as it evolves.

## Table of Contents
- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Features Covered](#features-covered)
- [How to Run](#how-to-run)
- [Contributing](#contributing)
- [License](#license)

## Introduction
Java has seen significant improvements and new features introduced with each LTS release. This repository is organized into submodules, each representing a different LTS version of Java. Each submodule contains examples of the key features introduced in that version.

## Project Structure
The project is organized into the following submodules:

- **java8-examples**: Covers features from Java 8 (e.g., Lambda expressions, Stream API, Optional).
- **java11-examples**: Covers features from Java 11 (e.g., Local-Variable Syntax for Lambda Parameters, HTTP Client).
- **java17-examples**: Covers features from Java 17 (e.g., Sealed Classes, Pattern Matching for `instanceof`).
- **java21-examples**: Covers features from Java 21 (e.g., Virtual Threads, Pattern Matching for Switch, Sequenced Collections).

Each submodule contains a set of examples that can be run independently.

## Features Covered
Here are some of the key features covered in this repository:

### Java 8
- Lambda Expressions
- Stream API
- Optional
- ...

### Java 11
- Local-Variable Syntax for Lambda Parameters
- HTTP Client
- Running Java Files Without Compilation
- ...

### Java 17
- Sealed Classes
- Pattern Matching for `instanceof`
- Records
- ...

### Java 21
- Virtual Threads (Project Loom)
- Pattern Matching for Switch
- String Templates
- Sequenced Collections
- ...

## How to Run
To run the examples:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/arianmtzcu/java-lts-features.git
   cd java-lts-features-examples
   ```

2. **Navigate to the desired submodule:**
    ```bash
    cd java17-examples
   ```

3. **Build and run the examples using Maven:**
    ```bash
    mvn clean install
   ```

4. **Run individual classes:**:
    ```bash
    mvn exec:java -Dexec.mainClass="com.arian.example.ClassName"
    ```
   
## Contributing
Contributions are welcome! If you have a feature or example you'd like to add, feel free to fork the repository, make your changes, and submit a pull request.

## License
This project is licensed under the [MIT License](https://opensource.org/license/MIT).