package CreationalPatterns.AbstractFactoryPattern.Factory;

import CreationalPatterns.AbstractFactoryPattern.Product.Driver;
import CreationalPatterns.AbstractFactoryPattern.Product.TruckDriver;
import CreationalPatterns.AbstractFactoryPattern.Product.Airplane;
import CreationalPatterns.AbstractFactoryPattern.Product.Transport;

// concrete factory 2
public class AirTrafficCompany extends BranchTrafficCompany {
    @Override
    public Transport createTransport() {
        System.out.println("空运分公司造了一架飞机");
        return new Airplane();
    }

    @Override
    public Driver driverTrain() {
        System.out.println("空运分公司培训了一位飞行员");
        return new TruckDriver();
    }
}
