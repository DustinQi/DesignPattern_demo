package CreationalPatterns.BuilderPattern.Product;

/**
 * 具体产品2(其实就是一个pojo)
 */
public class HeavyTruck implements AutoMobile {
    private String carType = "东风重卡";
    private String seat;
    private String wheel;
    private String engine;
    private String container;
    private String logo;

    @Override
    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setContainer(String container) {
        this.container = container;
    }

    @Override
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void info(){
        String desc = "这是一辆" + carType + "\n" +
                "座椅: " +  seat + "\n" +
                "车轮: " +  wheel + "\n" +
                "发动机: " +  engine + "\n" +
                "货箱: " +  container + "\n" +
                "logo: " +  logo + "\n";
        System.out.println(desc);
    }
}
