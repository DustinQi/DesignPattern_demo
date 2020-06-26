package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.AbstractFactoryPattern.Factory.AirTrafficCompany;
import CreationalPatterns.AbstractFactoryPattern.Factory.BranchTrafficCompany;
import CreationalPatterns.AbstractFactoryPattern.Factory.GroundTrafficCompany;
import CreationalPatterns.AbstractFactoryPattern.Product.Driver;
import CreationalPatterns.AbstractFactoryPattern.Product.Transport;

public class client {
    public static void main(String[] args){
        // 抽象工厂模式
        BranchTrafficCompany airCompany = new AirTrafficCompany();
        Transport plane = airCompany.createTransport();
        Driver pilot = airCompany.driverTrain();

        BranchTrafficCompany groundCompany = new GroundTrafficCompany();
        Transport truck = groundCompany.createTransport();
        Driver truckDriver = groundCompany.driverTrain();
    }
}
