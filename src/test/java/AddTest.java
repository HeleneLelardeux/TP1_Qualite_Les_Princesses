import org.junit.Test;            // JUnit 4
import static org.junit.Assert.*;  // Assertions JUnit 4

public class AddTest {

    @Test
    public void testAdd() {
        Add adder = new Add();
        
        // Test simple
        assertEquals(5, adder.add(2, 3));
        
        // Test avec zéro
        assertEquals(0, adder.add(0, 0));
        
        // Test avec nombres négatifs
        assertEquals(-1, adder.add(-2, 1));
        
        // Test avec grand nombre
        assertEquals(1000, adder.add(500, 500));
    }
}