package CreationalPatterns.FactoryPattern.Factory;

import CreationalPatterns.FactoryPattern.Product.Transport;
import CreationalPatterns.FactoryPattern.Product.Truck;

// concrete factory 1
public class TruckFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        System.out.println("卡车工厂制造卡车");
        return new Truck();
    }
}
