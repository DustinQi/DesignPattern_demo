package CreationalPatterns.AbstractFactoryPatterns.Factory;

import CreationalPatterns.AbstractFactoryPatterns.Product.Driver;
import CreationalPatterns.AbstractFactoryPatterns.Product.Transport;

// factory
public abstract class BranchTrafficCompany {
    public BranchTrafficCompany(){
        System.out.println("这是一个运输子公司");
    }

    // 这里的创建对象是Transport，而不是具体的Truck或Airplane，从而保证了扩展性
    public abstract Transport createTransport();

    // 培训驾驶员
    public abstract Driver driverTrain();
}
