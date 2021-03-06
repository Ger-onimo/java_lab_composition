import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse(5, "wired");
    }

    @Test
    public void hasButtons(){
        assertEquals(5, mouse.getButtons());
    }

    @Test
    public void hasType(){
        assertEquals("wired", mouse.getType());
    }

    @Test
    public void canClickButton(){
        assertEquals("L", mouse.click("L"));
    }

    @Test
    public void canMoveMouse(){
        assertEquals("round and round", mouse.move("round and round"));
    }

    @Test
    public void canInputData(){
        assertEquals("You clicked the Right mouse button", mouse.inputData("Right mouse button"));
    }
}
