import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("wireless");
    }

    @Test
    public void hasAType(){
        assertEquals("wireless", keyboard.getType());
    }

    @Test
    public void canPressKey(){
        assertEquals("Key pressed is enter", keyboard.pressKey("enter"));
    }

    @Test
    public void canInputData(){
        assertEquals("Key pressed is enter", keyboard.inputData("enter"));
    }
}
