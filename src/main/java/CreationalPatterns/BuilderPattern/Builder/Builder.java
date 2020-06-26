package CreationalPatterns.BuilderPattern.Builder;

import CreationalPatterns.BuilderPattern.Product.AutoMobile;

/**
 * 抽象生成器类（可理解成抽象工厂类）
 */
public interface Builder {
    void installSeat(String seat);
    void installWheel(String wheel);
    void installEngine(String engine);
    void installContainer(String container);
    void installLogo(String logo);
    AutoMobile getAutoMobile();
    void info();
}
