package CreationalPatterns.BuilderPattern.Builder;

import CreationalPatterns.BuilderPattern.Product.Car;
import CreationalPatterns.BuilderPattern.Product.Wuling;

/**
 * 具体生成器类2：五菱宏光生成器
 */
public class WulingBuilder implements Builder {
    private Wuling wuling = new Wuling();

    @Override
    public void installSteering(Integer steering) {
        wuling.setSteering(steering);
    }

    @Override
    public void installWheel(Integer wheel) {
        wuling.setWheel(wheel);
    }

    @Override
    public void installAccelerator(Integer accelerator) {
        wuling.setAcclerator(accelerator);
    }

    @Override
    public void installClutch(Integer clutch) {
        wuling.setClutch(clutch);
    }

    @Override
    public void installDieselEngine(String dieselEngine) {
        wuling.setDieselEngine(dieselEngine);
    }

    @Override
    public void installGasolineEngine(String gasolineEngine) {
        wuling.setGasolineEngine(gasolineEngine);
    }

    @Override
    public void installNavigator(String navigator) {
        wuling.setNavigator(navigator);
    }

    @Override
    public void installTop(String top) {
        wuling.setTop(top);
    }

    @Override
    public Car getCar() {
        wuling.carType = "五菱宏光";
        return this.wuling;
    }
}
