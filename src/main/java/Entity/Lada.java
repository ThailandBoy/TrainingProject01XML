package Entity;

public class Lada implements Auto{
    private String model = "Lada Calina";
    private int price = 760000;
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Lada { model = '"+model+"'; price = '"+price+"'";
    }
}
