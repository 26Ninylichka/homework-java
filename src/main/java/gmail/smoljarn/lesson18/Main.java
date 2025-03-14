package gmail.smoljarn.lesson18;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

  Car bmw530d = new Car(60, 6, LocalDate.of(2025, 6, 12));
        System.out.println("Машина може їхати: " + bmw530d.canDrive());
        System.out.println("Машина допущена до експлуатації: " + bmw530d.isAllowedToDrive());
        System.out.println("Максимальна дистанція: " + bmw530d.maxDistance() + " км");
    }
}