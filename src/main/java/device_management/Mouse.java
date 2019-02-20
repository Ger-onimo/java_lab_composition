package device_management;

public class Mouse {
    int buttons;
    String type;

    public Mouse(int buttons, String type) {
        this.buttons = buttons;
        this.type = type;
    }

    public int getButtons() {
        return buttons;
    }

    public String getType() {
        return type;
    }
}
