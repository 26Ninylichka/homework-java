package gmail.smoljarn.lesson18;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Car {
    public double fuelLevel;
    public double fuelConsumption;
    public LocalDate nextTuv;

    public Car(double fuelLevel, double fuelConsumption, LocalDate nextTuv){
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
        this.nextTuv = nextTuv;
    }
    public boolean canDrive(){
        return fuelLevel > 0;
    }
    public boolean isAllowedToDrive() {
        return LocalDate.now().isBefore(nextTuv) || LocalDate.now().isEqual(nextTuv);

    }
    public double maxDistance() {
        return (fuelLevel / fuelConsumption) * 100;
    }
}