    package ch33_Interface.task33.Task02;

    public class Vehicle {//pojo

    private String model;
    private String engine;

        public Vehicle(String model, String engine) {
            this.model = model;
            this.engine = engine;
        }

        public Vehicle() {
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        @Override
        public String toString() {
            return "Vehicle{" +
                    "model='" + model + '\'' +
                    ", engine='" + engine + '\'' +
                    '}';
        }

    }
