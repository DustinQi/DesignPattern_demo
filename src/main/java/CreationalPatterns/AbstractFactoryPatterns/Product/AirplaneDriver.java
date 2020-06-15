package CreationalPatterns.AbstractFactoryPatterns.Product;

public class AirplaneDriver implements Driver {
    public AirplaneDriver(){
        System.out.println("培养出一位飞行员");
    }

    @Override
    public void operate() {
        System.out.println("飞行员驾驶737翩翩起舞");
    }
}
