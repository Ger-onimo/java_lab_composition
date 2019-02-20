package device_management;

import behaviours.IInput;

public class Keyboard implements IInput {

   String type;

    public Keyboard(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String inputData(String data) {
        return data;
    }

    public String pressKey(String key){
        return key;
    }
}
