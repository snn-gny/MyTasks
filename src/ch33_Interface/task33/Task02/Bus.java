package ch33_Interface.task33.Task02;

public class Bus extends Vehicle implements IDiesel {


    @Override
    public void changeDiesel() {

    }

    @Override
    public String drive() {
        return null;
    }

    public Bus(String model, String engine) {
        super(model, engine);
    }

    public Bus() {
    }
}
