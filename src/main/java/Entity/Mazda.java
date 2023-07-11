package Entity;

public class Mazda implements Auto{
    private String model = "Mazda RX7";
    private int price = 2350000;
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Mazda{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

