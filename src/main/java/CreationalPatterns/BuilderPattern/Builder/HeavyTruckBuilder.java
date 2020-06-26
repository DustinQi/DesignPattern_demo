package CreationalPatterns.BuilderPattern.Builder;


import CreationalPatterns.BuilderPattern.Product.AutoMobile;
import CreationalPatterns.BuilderPattern.Product.HeavyTruck;

/**
 * 具体生成器2。生成具体产品的方法是在这里实现的。
 */
public class HeavyTruckBuilder implements Builder {
    private HeavyTruck truck = new HeavyTruck();

    @Override
    public void installSeat(String seat) {
        truck.setSeat(seat);
    }

    @Override
    public void installWheel(String wheel) {
        truck.setWheel(wheel);
    }

    @Override
    public void installEngine(String engine) {
        truck.setEngine(engine);
    }

    @Override
    public void installContainer(String container) {
        truck.setContainer(container);
    }

    @Override
    public void installLogo(String logo) {
        truck.setLogo(logo);
    }

    @Override
    public AutoMobile getAutoMobile() {
        return this.truck;
    }

    @Override
    public void info(){
        truck.info();
    }
}
