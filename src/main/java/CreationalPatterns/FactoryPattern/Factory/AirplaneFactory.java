package CreationalPatterns.FactoryPattern.Factory;

import CreationalPatterns.FactoryPattern.Product.Airplane;
import CreationalPatterns.FactoryPattern.Product.Transport;

// concrete factory 2
public class AirplaneFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        System.out.println("飞机工厂制造飞机");
        return new Airplane();
    }
}
