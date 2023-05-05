package ch33_Interface.task33.Task02;

public class TeslaCar extends Vehicle implements IElectric,IVehicle  {


    @Override
    public void changeBattery() {

    }

    @Override
    public String drive() {
        return "tesla calisiyor";
    }

    public TeslaCar(String model, String engine) {
        super(model, engine);
    }

    public TeslaCar() {
    }
}
