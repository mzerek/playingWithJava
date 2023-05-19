package mzerek.java8to17;

public class SolutionJava17 {

    public static void main(String[] args) {
    }
}

//Java17 - Sealed Classes
sealed class Vehicle17 permits Tank17, Bicycle17 {
    String vehicleName;
}

final class Tank17 extends Vehicle17 {
    double kilomenters = 223.5;
    int year = 2022;
}

final class Bicycle17 extends Vehicle17 {
    double wheelSize = 30.1;
}

final class Plane17 {
    double wheelSize = 30.1;

}


