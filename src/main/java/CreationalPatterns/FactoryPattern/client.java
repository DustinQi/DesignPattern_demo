package CreationalPatterns.FactoryPattern;

import CreationalPatterns.FactoryPattern.Factory.AirplaneFactory;
import CreationalPatterns.FactoryPattern.Factory.TransportFactory;
import CreationalPatterns.FactoryPattern.Factory.TruckFactory;
import CreationalPatterns.FactoryPattern.Product.Transport;

// 调用方
public class client {
    public static void main(String[] args){
        // 工厂方法模式
        TransportFactory truckFactory = new TruckFactory();
        TransportFactory airplaneFactory = new AirplaneFactory();
        Transport truck = truckFactory.createTransport();
        Transport airplane = airplaneFactory.createTransport();
        truck.load();
        truck.travel();
        airplane.load();
        airplane.travel();
    }
}
