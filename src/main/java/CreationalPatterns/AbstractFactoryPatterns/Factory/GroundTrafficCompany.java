package CreationalPatterns.AbstractFactoryPatterns.Factory;

import CreationalPatterns.AbstractFactoryPatterns.Product.AirplaneDriver;
import CreationalPatterns.AbstractFactoryPatterns.Product.Driver;
import CreationalPatterns.AbstractFactoryPatterns.Product.Transport;
import CreationalPatterns.AbstractFactoryPatterns.Product.Truck;

// concrete factory 1
public class GroundTrafficCompany extends BranchTrafficCompany {
    @Override
    public Transport createTransport() {
        System.out.println("陆运分公司造了一辆卡车");
        return new Truck();
    }

    @Override
    public Driver driverTrain() {
        System.out.println("陆运分公司培训了一位卡车司机");
        return new AirplaneDriver();
    }
}
