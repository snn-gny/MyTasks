package ch33_Interface.task33.Task02;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OtoGaleri {
    public static void main(String[] args) {
        Vehicle tesla = new TeslaCar("tesla1", "diesel");
        Vehicle toyota = new ToyotaPrius("toy 1", "benzin");
        Vehicle bus = new Bus("bus1", "gas");

        List<Vehicle> list1 = new ArrayList<>(Arrays.asList(tesla, toyota, bus));
        System.out.println("list1 = " + list1);

        //list1 = [Vehicle{model='tesla1', engine='diesel'},
        // Vehicle{model='toy 1', engine='benzin'},
        // Vehicle{model='bus1', engine='gas'}]


    }

}
