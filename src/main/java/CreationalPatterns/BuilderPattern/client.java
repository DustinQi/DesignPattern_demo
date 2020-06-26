package CreationalPatterns.BuilderPattern;

import CreationalPatterns.BuilderPattern.Builder.Builder;
import CreationalPatterns.BuilderPattern.Builder.HeavyTruckBuilder;
import CreationalPatterns.BuilderPattern.Builder.SportCarBuilder;
import CreationalPatterns.BuilderPattern.Product.HeavyTruck;
import CreationalPatterns.BuilderPattern.Product.SportCar;

// 生成器模式client
public class client {
    public static void main(String[] args){
        /**
         * 获取主管类（“拿起生成器说明书”）
          */
        Director director = new Director();

        /**
         * 制造超跑
         */
        Builder sportCarBuilder = new SportCarBuilder();
        // 主管类操作跑车生成器，在生成超跑前先进行一些安装工作
        director.produceSportCar(sportCarBuilder);
        // 设置完成后，生产超跑
        SportCar sportCar = (SportCar) sportCarBuilder.getAutoMobile();
        // 查看超跑成品
        sportCar.info();

        /**
         * 制造卡车
         */
        Builder heavyTruckBuilder = new HeavyTruckBuilder();
        // 主管类操作卡车生成器，在生成卡车前先进行一些安装工作
        director.produceHeavyTruck(heavyTruckBuilder);
        // 设置完成后，生产卡车
        HeavyTruck heavyTruck = (HeavyTruck) heavyTruckBuilder.getAutoMobile();
        // 查看超跑成品
        heavyTruck.info();
    }
}
