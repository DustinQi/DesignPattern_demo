package CreationalPatterns.FactoryPatterns;

import CreationalPatterns.FactoryPatterns.Factory.AirplaneFactory;
import CreationalPatterns.FactoryPatterns.Factory.TransportFactory;
import CreationalPatterns.FactoryPatterns.Factory.TruckFactory;
import CreationalPatterns.FactoryPatterns.Product.Transport;

// 调用方
public class client {
    public static void main(String[] args){
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
