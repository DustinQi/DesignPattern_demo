package CreationalPatterns.BuilderPattern.Product;

/**
 * 具体产品1(其实就是一个pojo)
 */
public class SportCar implements AutoMobile {
    private String carType;
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

    public SportCar(){
        // 一些初始化工作
        this.carType = "肌肉跑车";
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
