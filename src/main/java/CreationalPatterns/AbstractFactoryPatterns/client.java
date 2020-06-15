package CreationalPatterns.AbstractFactoryPatterns;

import CreationalPatterns.AbstractFactoryPatterns.Factory.AirTrafficCompany;
import CreationalPatterns.AbstractFactoryPatterns.Factory.BranchTrafficCompany;
import CreationalPatterns.AbstractFactoryPatterns.Factory.GroundTrafficCompany;
import CreationalPatterns.AbstractFactoryPatterns.Product.Driver;
import CreationalPatterns.AbstractFactoryPatterns.Product.Transport;

public class client {
    public static void main(String[] args){
        BranchTrafficCompany airCompany = new AirTrafficCompany();
        Transport plane = airCompany.createTransport();
        Driver pilot = airCompany.driverTrain();

        BranchTrafficCompany groundCompany = new GroundTrafficCompany();
        Transport truck = groundCompany.createTransport();
        Driver truckDriver = groundCompany.driverTrain();
    }
}
