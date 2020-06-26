package CreationalPatterns.AbstractFactoryPattern.Product;

public class TruckDriver implements Driver {
    public TruckDriver(){
        System.out.println("培养出一位货车司机");
    }

    @Override
    public void operate() {
        System.out.println("货车司机驾驶江淮漂移");
    }
}
