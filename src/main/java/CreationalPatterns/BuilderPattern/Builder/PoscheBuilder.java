package CreationalPatterns.BuilderPattern.Builder;

import CreationalPatterns.BuilderPattern.Product.Car;
import CreationalPatterns.BuilderPattern.Product.Posche;

/**
 * 具体生成器类1：保时捷生成器
 */
public class PoscheBuilder implements Builder {
    private Posche posche = new Posche();

    @Override
    public void installSteering(Integer steering) {
        posche.setSteering(steering);
    }

    @Override
    public void installWheel(Integer wheel) {
        posche.setWheel(wheel);
    }

    @Override
    public void installAccelerator(Integer accelerator) {
        posche.setAcclerator(accelerator);
    }

    @Override
    public void installClutch(Integer clutch) {
        posche.setClutch(clutch);
    }

    @Override
    public void installDieselEngine(String dieselEngine) {
        posche.setDieselEngine(dieselEngine);
    }

    @Override
    public void installGasolineEngine(String gasolineEngine) {
        posche.setGasolineEngine(gasolineEngine);
    }

    @Override
    public void installNavigator(String navigator) {
        posche.setNavigator(navigator);
    }

    @Override
    public void installTop(String top) {
        posche.setTop(top);
    }

    @Override
    public Car getCar() {
        posche.carType = "保时捷";
        return this.posche;
    }

}
