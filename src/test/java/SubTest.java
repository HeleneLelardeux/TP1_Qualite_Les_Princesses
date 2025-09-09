import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SubTest {
    @Test
    public void testSub() {
        Sub sub = new Sub();
        assertEquals(1, sub.sub(3, 2));
    }
}