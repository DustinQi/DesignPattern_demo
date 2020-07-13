package CreationalPatterns.BuilderPattern;

import CreationalPatterns.BuilderPattern.Builder.Builder;

/**
 * 主管类
 * 主管类可以理解成是生成器的指挥者，指挥生成器调用某些步骤，以及调整不同步骤的顺序等
 */
public class CarDirector {
    // 生产保时捷的详细步骤和顺序
    public void producePosche(Builder builder){
        builder.installWheel(4);
        builder.installSteering(1);
        builder.installAccelerator(1);
        builder.installGasolineEngine("高端汽油发动机");
        builder.installNavigator("高端车载导航");
    }

    // 生产五菱宏光的详细步骤和顺序
    public void produceWuling(Builder builder){
        builder.installWheel(4);
        builder.installSteering(1);
        builder.installAccelerator(1);
        builder.installClutch(1);
        builder.installGasolineEngine("国产汽油发动机");
        builder.installTop("一块铁板");
    }
}
