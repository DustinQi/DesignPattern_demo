package CreationalPatterns.BuilderPattern.Product;

/**
 * 抽象产品类
 * 可以有，但没必要。因为生成器模式并非只能生产同一系列的产品。
 */
public abstract class Car {
    public String carType;
    abstract void info();
}
