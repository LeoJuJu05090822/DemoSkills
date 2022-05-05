import org.junit.*;
import static org.junit.Assert.*;

public class DemoSkillsTest{
    DemoSkills test1 = new DemoSkills(2, 60);

    @Test
    public void Test(){
        assertEquals(20, test1.average());
    }
}
