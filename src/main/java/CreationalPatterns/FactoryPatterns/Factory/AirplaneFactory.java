package CreationalPatterns.FactoryPatterns.Factory;

import CreationalPatterns.FactoryPatterns.Product.Airplane;
import CreationalPatterns.FactoryPatterns.Product.Transport;

// concrete factory 2
public class AirplaneFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        System.out.println("飞机工厂制造飞机");
        return new Airplane();
    }
}
