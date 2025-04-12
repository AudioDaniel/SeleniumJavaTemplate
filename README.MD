# Selenium Java Maven Template

This project is a template for creating Selenium-based test automation frameworks using Java and Maven. It provides a pre-configured setup with essential dependencies and a project structure to help you get started quickly.

## Prerequisites

- **Java 21**: Ensure you have JDK 21 installed.
- **Maven**: Install Maven to manage dependencies and build the project.

## Dependencies

The project uses the following key dependencies:

- **Selenium Java**: For browser automation.
- **WebDriverManager**: To manage WebDriver binaries automatically.
- **JUnit**: For writing and running test cases.
- **Gson**: For JSON parsing.

These dependencies are defined in the [`pom.xml`](pom.xml) file.

## Getting Started

1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd SeleniumJavaMavenTemplate
   ```

2. Install dependencies:
    ```
    mvn clean install
    ``` 

3. Run tests:
    ```
    mvn test
    ```

# Locators

You can store locators on src\main\java\org\example\resources in a Json file to ensure easier maintainability. You can use the class LocatorReader to acces them.

# Writing Tests
Place your test classes in the src/test/java/org/example directory.
Use the Page Object Model (POM) pattern for better maintainability. Define page classes in src/main/java/org/example/pages.

# Example Test
Here is an example of a simple test:

```
package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void testLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        // Add test steps here
        driver.quit();
    }
}
```

# Contributing
Contributions are welcome! Feel free to fork the repository and submit pull requests.

# Support
If you encounter any issues, please open an issue in the repository or contact the maintainer. ```