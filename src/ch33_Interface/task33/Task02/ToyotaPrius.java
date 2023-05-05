package ch33_Interface.task33.Task02;

public class ToyotaPrius extends Vehicle implements IElectric, IGas,IVehicle  {


    @Override
    public void changeBattery() {

    }

    @Override
    public void changeOil() {

    }

    @Override
    public String drive() {
        return null;
    }

    public ToyotaPrius(String model, String engine) {
        super(model, engine);
    }

    public ToyotaPrius() {
    }

}




