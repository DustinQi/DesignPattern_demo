package CreationalPatterns.AbstractFactoryPattern.Product;

// concrete product 1
public class Truck implements Transport {
    public Truck(){
        System.out.println("生产了一辆江淮");
    }

    @Override
    public void load() {
        System.out.println("卡车带货");
    }

    @Override
    public void travel() {
        System.out.println("卡车在路上行驶");
    }
}
