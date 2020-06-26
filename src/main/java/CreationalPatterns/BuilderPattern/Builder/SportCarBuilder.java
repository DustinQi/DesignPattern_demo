package CreationalPatterns.BuilderPattern.Builder;


import CreationalPatterns.BuilderPattern.Product.AutoMobile;
import CreationalPatterns.BuilderPattern.Product.SportCar;

/**
 * 具体生成器1。生成具体产品的方法是在这里实现的。
 */
public class SportCarBuilder implements Builder {
    private SportCar sportCar = new SportCar();

    @Override
    public void installSeat(String seat) {
        sportCar.setSeat(seat);
    }

    @Override
    public void installWheel(String wheel) {
        sportCar.setWheel(wheel);
    }

    @Override
    public void installEngine(String engine) {
        sportCar.setEngine(engine);
    }

    @Override
    public void installContainer(String container) {
        sportCar.setContainer(container);
    }

    @Override
    public void installLogo(String logo) {
        sportCar.setLogo(logo);
    }

    @Override
    public AutoMobile getAutoMobile() {
        return this.sportCar;
    }

    @Override
    public void info(){
        sportCar.info();
    }
}
