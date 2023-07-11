package Service;

public class FactoryMethodExample {
    private FactoryMethodExample(){}
    public static FactoryMethodExample getFactoryMethodExample(){
        return new FactoryMethodExample();
    }
    public void getCheckFactory(){
        System.out.println("FactoryMethodExample is created!");
    }
}
