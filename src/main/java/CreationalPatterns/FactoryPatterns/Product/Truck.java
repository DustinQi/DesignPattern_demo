package CreationalPatterns.FactoryPatterns.Product;

// concrete product 1
public class Truck implements Transport {
    @Override
    public void load() {
        System.out.println("卡车带货");
    }

    @Override
    public void travel() {
        System.out.println("卡车在路上行驶");
    }
}
