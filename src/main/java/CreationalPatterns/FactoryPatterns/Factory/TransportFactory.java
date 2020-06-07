package CreationalPatterns.FactoryPatterns.Factory;

import CreationalPatterns.FactoryPatterns.Product.Transport;

// factory
public abstract class TransportFactory {
    public TransportFactory(){
        System.out.println("transport工厂启动...");
    }

    // 这里的创建对象是Transport，而不是具体的Truck或Airplane，从而保证了扩展性
    public abstract Transport createTransport();
}
