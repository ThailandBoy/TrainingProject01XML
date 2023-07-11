package Service;

public class InitDestroyExample {
    private String myInit;
    public void doMyInit(){
        myInit = "doMyInit() activated!";
    }
    public void doMyDestroy(){
        System.out.println("doMyDestroy() activated!");
    }
    public String getMyInit() {
        return myInit;
    }


}
