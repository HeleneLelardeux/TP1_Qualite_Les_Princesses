import org.junit.Test;                // JUnit 4
import static org.junit.Assert.*;     // Assertions JUnit 4

public class AddTest {

    @Test
    public void testAdd() {
        Add adder = new Add();
        assertEquals(5, adder.add(2,3));
        assertEquals(0, adder.add(0,0));
    }
}