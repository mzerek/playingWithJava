package mzerek.java8to17;

import java.util.Calendar;

public class SolutionJava16 {

    public static void main(String[] args) {
        Vehicle v = new Tank();
        Vehicle v2 = new Bicycle();
        System.out.println(priceOld(v));
        System.out.println("==================");
        System.out.println(priceNew(v2));


        System.out.println("==================");
        Plane plane = new Plane(10, "LOT", 1000L);
        System.out.println(plane.wingsSize());
        System.out.println(plane.name());
        System.out.println(plane.distance());
    }

    public static double priceOld(Vehicle v) {
        if (v instanceof Tank) {
            Tank c = (Tank) v;
            return 10000 - c.kilomenters * 0.01 -
                    (Calendar.getInstance().get(Calendar.YEAR) -
                            c.year) * 100;
        } else if (v instanceof Bicycle) {
            Bicycle b = (Bicycle) v;
            return 1000 + b.wheelSize * 10;
        } else throw new IllegalArgumentException();
    }

    //Java16 - instanceof Pattern Matching
    public static double priceNew(Vehicle v) {
        if (v instanceof Tank c) {
            return 10000 - c.kilomenters * 0.01 -
                    (Calendar.getInstance().get(Calendar.YEAR) -
                            c.year) * 100;
        } else if (v instanceof Bicycle b) {
            return 1000 + b.wheelSize * 10;
        } else throw new IllegalArgumentException();
    }
}

class Vehicle {
    String vehicleName;
}

class Tank extends Vehicle {
    double kilomenters = 223.5;
    int year = 2022;
}

class Bicycle extends Vehicle {
    double wheelSize = 30.1;
}


record Plane(int wingsSize, String name, long distance) {

}
