package CreationalPatterns.AbstractFactoryPattern.Factory;

import CreationalPatterns.AbstractFactoryPattern.Product.AirplaneDriver;
import CreationalPatterns.AbstractFactoryPattern.Product.Driver;
import CreationalPatterns.AbstractFactoryPattern.Product.Transport;
import CreationalPatterns.AbstractFactoryPattern.Product.Truck;

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
