package device_management;

import behaviours.IInput;

public class Mouse implements IInput {
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

    public String click(String button){
        return button;
    }

    public String move(String direction){
        return direction;
    }

    @Override
    public String inputData(String data) {
        return "You clicked the " + data;
    }
}
