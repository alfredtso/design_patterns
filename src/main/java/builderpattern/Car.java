package builderpattern;

public class Car {
    private final String make;
    private final int cc;
    private final int numberOfSeats;

    public static class Builder {
        // required parameter
        private final String make;

        // optional
        private int cc = 0;
        private int numberOfSeats = 0;

        public Builder(String make) {
            this.make = make;
        }

        public Builder cc(int cc) {
            this.cc = cc;
            return this;
        }

        public Builder numberOfSeats(int seats) {
            this.numberOfSeats = seats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        make = builder.make;
        cc = builder.cc;
        numberOfSeats = builder.numberOfSeats;
    }

    public static void main(String[] args) {
        Car xc = new Car.Builder("Volvo").cc(2000).numberOfSeats(4).build();

    }
}

