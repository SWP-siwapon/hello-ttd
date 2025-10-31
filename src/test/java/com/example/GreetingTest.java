import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// เราจะ import คลาส Greeting เข้ามา แม้ว่ามันจะยังไม่มีก็ตาม
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
}
