import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyMapTest {
    @Test
    public void testPutAndGet() {
        MyMap<String, String> map = new MyMap<>();
        map.put("A", "1");
        map.put("B", "2");
        Assertions.assertEquals("1", map.get("A"));
        Assertions.assertEquals("2", map.get("B"));
    }
}
