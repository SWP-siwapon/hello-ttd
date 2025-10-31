import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.Greeting;

class GreetingTest {
    @Test
    void testHelloBasic() {
        // 1. Arrange
        Greeting greeting = new Greeting();

        // 2. Act
        String result = greeting.sayHello("World");

        // 3. Assert
        assertEquals("Hello, World", result);
    }

    @Test
    void testHelloNull() {
        // Arrange
        Greeting greeting = new Greeting();
        // Act
        String result = greeting.sayHello(null);
        // Assert
        assertEquals("Hello, Friend", result);
    }
}
