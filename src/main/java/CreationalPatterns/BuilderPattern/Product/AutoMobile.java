package CreationalPatterns.BuilderPattern.Product;

/**
 * Product  抽象产品类（个人认为不是必须的，可以不要）
 */
public interface AutoMobile {
    void setSeat(String seat);
    void setWheel(String wheel);
    void setEngine(String engine);
    void setContainer(String container);
    void setLogo(String logo);
}
