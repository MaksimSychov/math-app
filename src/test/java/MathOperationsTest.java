import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsTest {

    @Test
    void testAdd() {
        assertEquals(8, MathOperations.add(5, 3));
        assertEquals(0, MathOperations.add(0, 0));
        assertEquals(-2, MathOperations.add(5, -7));
    }

    @Test
    void testSubtract() {
        assertEquals(2, MathOperations.subtract(5, 3));
        assertEquals(-2, MathOperations.subtract(3, 5));
        assertEquals(0, MathOperations.subtract(5, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(15, MathOperations.multiply(5, 3));
        assertEquals(0, MathOperations.multiply(5, 0));
        assertEquals(-15, MathOperations.multiply(5, -3));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, MathOperations.divide(5, 2));
        assertEquals(0.0, MathOperations.divide(0, 5));
        assertEquals(-2.0, MathOperations.divide(-6, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class,
                () -> MathOperations.divide(10, 0));
        assertEquals("Деление на ноль невозможно", exception.getMessage());
    }

    @Test
    void testIsEven() {
        assertTrue(MathOperations.isEven(4));
        assertTrue(MathOperations.isEven(0));
        assertFalse(MathOperations.isEven(7));
        assertFalse(MathOperations.isEven(-3));
    }

    @Test
    void testFactorial() {
        assertEquals(1, MathOperations.factorial(0));
        assertEquals(1, MathOperations.factorial(1));
        assertEquals(120, MathOperations.factorial(5));
        assertEquals(3628800, MathOperations.factorial(10));
    }

    @Test
    void testFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> MathOperations.factorial(-5));
        assertEquals("Факториал не определен для отрицательных чисел", exception.getMessage());
    }
}