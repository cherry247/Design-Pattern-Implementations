package Questions;

import Questions.Vehicle.Builder;

/* A Vehicle has many optional fields — brand, model, color, engine, sunroof, GPS. 
Creating it with a constructor with 6 parameters is messy. 
Build a VehicleBuilder that lets you set only what you need in a fluent chain, then call build(). */

class Vehicle {
    private final String brand, model, color, engine;
    private final boolean sunroof, gps;

    private Vehicle(Builder bd) {
        brand = bd.brand;
        model = bd.model;
        color = bd.color;
        engine = bd.engine;
        sunroof = bd.sunroof;
        gps = bd.gps;
    }

    public String toString() {
        return brand + " " + model + " [" + color + "]"
            + (sunroof ? " +sunroof" : "")
            + (engine )
            + (gps     ? " +GPS"    : "");
    }

    static class Builder {
        private final String brand;
        private String model = "Base";
        private String color = "White";
        private String engine = "1.6L";
        private boolean sunroof = false;
        private boolean gps = false;

        Builder(String name){
            this.brand = name;
        }

        Builder model(String name){
            model = name;
            return this;
        }

        Builder color(String name){
            color = name;
            return this;
        }
        Builder engine(String name){
            engine = name;
            return this;
        }
        Builder sunroof(){
            sunroof = true;
            return this;
        }
        Builder gps(){
            gps = true;
            return this;
        }

        Vehicle build() { return new Vehicle(this); }
    }
}


class VehicleBuilder{
    public static void main(String[] args) {
        Vehicle v = new Vehicle.Builder("Toyota")
    .model("Innova")
    .color("Silver")
    .sunroof()
    .gps()
    .engine("qwdw")
    .build();
       
    System.out.println(v);

    }
}
