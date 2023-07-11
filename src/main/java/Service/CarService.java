package Service;

import Entity.Auto;

public class CarService {
    private Auto auto;
    private boolean available;
    private int carCount;

    // Ввод зависимости через сеттер
    public void setAuto(Auto auto){
        this.auto = auto;
    }

    public void printAuto(){
        System.out.println(auto.toString());
    }
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }


}
