package CreationalPatterns.BuilderPattern.Builder;

import CreationalPatterns.BuilderPattern.Product.Car;

/**
 * 抽象生成器类（可理解成抽象工厂类）
 */
public interface Builder {
    void installSteering(Integer steering);
    void installWheel(Integer wheel);
    void installAccelerator(Integer accelerator);
    void installClutch(Integer clutch);
    void installDieselEngine(String dieselEngine);
    void installGasolineEngine(String gasolineEngine);
    void installNavigator(String navigator);
    void installTop(String top);
    Car getCar();
}
