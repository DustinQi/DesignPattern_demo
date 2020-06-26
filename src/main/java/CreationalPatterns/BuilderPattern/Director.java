package CreationalPatterns.BuilderPattern;

import CreationalPatterns.BuilderPattern.Builder.Builder;

/**
 * 主管类。
 * 对象的具体生成方法是在相关生成器类之中定义的，而主管类可以理解成是生成器的说明书，详细定义了使用生成器创造产品的步骤顺序。
 */
public class Director {
    // 生产跑车的详细步骤和顺序
    public void produceSportCar(Builder builder){
        builder.installLogo("只比五环少一环");
        builder.installSeat("真皮座椅");
        builder.installWheel("超跑轮胎");
        builder.installEngine("超跑发动机");
    }

    // 生产重卡的详细步骤和顺序
    public void produceHeavyTruck(Builder builder){
        builder.installSeat("人造革座椅");
        builder.installWheel("卡车大轮胎");
        builder.installEngine("卡车发动机");
        builder.installContainer("大货箱");
        builder.installLogo("东风logo");
    }
}
