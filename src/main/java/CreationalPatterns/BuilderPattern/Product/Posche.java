package CreationalPatterns.BuilderPattern.Product;

/**
 * 具体产品1：保时捷
 */
public class Posche extends Car {
    // 轮胎个数
    private Integer wheel;
    // 方向盘个数
    private Integer steering;
    // 油门个数
    private Integer acclerator;
    // 离合器个数
    private Integer clutch;
    // 柴油发动机
    private String dieselEngine;
    // 汽油发动机
    private String gasolineEngine;
    // 车载导航
    private String navigator;
    // 车顶棚
    private String top;

    public Integer getWheel() {
        return wheel;
    }

    public void setWheel(Integer wheel) {
        this.wheel = wheel;
    }

    public Integer getSteering() {
        return steering;
    }

    public void setSteering(Integer steering) {
        this.steering = steering;
    }

    public Integer getAcclerator() {
        return acclerator;
    }

    public void setAcclerator(Integer acclerator) {
        this.acclerator = acclerator;
    }

    public Integer getClutch() {
        return clutch;
    }

    public void setClutch(Integer clutch) {
        this.clutch = clutch;
    }

    public String getDieselEngine() {
        return dieselEngine;
    }

    public void setDieselEngine(String dieselEngine) {
        this.dieselEngine = dieselEngine;
    }

    public String getGasolineEngine() {
        return gasolineEngine;
    }

    public void setGasolineEngine(String gasolineEngine) {
        this.gasolineEngine = gasolineEngine;
    }

    public String getNavigator() {
        return navigator;
    }

    public void setNavigator(String navigator) {
        this.navigator = navigator;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    @Override
    public void info() {
        String desc = "这是一辆" + carType + ":\n" +
                wheel + "个车轮\n" +
                steering + "个方向盘\n" +
                acclerator + "个油门\n" +
                clutch + "个离合器\n" +
                "柴油发动机:" + dieselEngine + "\n" +
                "汽油发动机:" + gasolineEngine + "\n" +
                "车载导航:" + navigator + "\n" +
                "车顶棚:" + top + "\n";
        System.out.println(desc);
    }
}
