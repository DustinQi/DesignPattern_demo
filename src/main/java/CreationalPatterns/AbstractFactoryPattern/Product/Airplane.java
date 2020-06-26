package CreationalPatterns.AbstractFactoryPattern.Product;

// concrete product 1
public class Airplane implements Transport {
    public Airplane(){
        System.out.println("生产了一架737");
    }

    @Override
    public void load() {
        System.out.println("飞机带货");
    }

    @Override
    public void travel() {
        System.out.println("飞机在天上行驶");
    }
}
