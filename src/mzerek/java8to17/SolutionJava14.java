package mzerek.java8to17;

import java.time.Month;

public class SolutionJava14 {

    public static void main(String[] args) {
        Month april = Month.APRIL;
        Month february = Month.FEBRUARY;
        Month october = Month.OCTOBER;

        System.out.println("Days of April: " + oldCase(april));
        System.out.println("Days of february: " + java14WayCase(february));
        System.out.println("Days of october: " + java14WayCaseWithYield(october));
    }

    public static int oldCase(Month month) {
        int days = 0;
        switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER:
                days = 31;
                break;
            case FEBRUARY:
                days = 28;
                break;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER:
                days = 30;
                break;
            default:
                throw new IllegalStateException();
        }

        return days;
    }

    //Java14 - Using Switch Expressions
    public static int java14WayCase(Month month) {
        return switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            default -> throw new IllegalStateException();
        };
    }

    //Java14 - Using Switch Expressions with yield Keyword
    public static int java14WayCaseWithYield(Month month) {
        return switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> {
                System.out.println(month);
                yield 31;
            }
            case FEBRUARY -> {
                System.out.println(month);
                yield 28;
            }
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> {
                System.out.println(month);
                yield 30;
            }
            default -> throw new IllegalStateException();
        };
    }
}
