package gmail.smoljarn.lesson18;
import java.time.LocalDate;
public class Car {
    public double fuelLevel;
    public double fuelConsumption;
    public LocalDate nextTuv;

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

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