package CreationalPatterns.BuilderPattern;

import CreationalPatterns.BuilderPattern.Builder.*;
import CreationalPatterns.BuilderPattern.Product.Posche;
import CreationalPatterns.BuilderPattern.Product.Wuling;

/**
 * 获得一辆汽车（具体产品），客户需要主管和具体生成器，无需知道生产汽车的具体过程和细节
 */
public class client {
    public static void main(String[] args) {
        /**
         * 获取主管类（“拿起生成器说明书并操作生成器”）
         */
        CarDirector director = new CarDirector();
        /**
         * 制造保时捷
         */
        PoscheBuilder poscheBuilder = new PoscheBuilder();
        // 主管类操作保时捷生成器，在生成卡车前先进行一些安装工作
        director.producePosche(poscheBuilder);
        // 设置完成后，生产我的保时捷
        Posche myPosche = (Posche) poscheBuilder.getCar();
        // 查看保时捷成品
        myPosche.info();
        /**
         * 制造五菱宏光
         */
        WulingBuilder wulingBuilder = new WulingBuilder();
        // 主管类操作五菱宏光生成器，在生成卡车前先进行一些安装工作
        director.produceWuling(wulingBuilder);
        // 设置完成后，生产你的五菱宏光
        Wuling yourWuling = (Wuling) wulingBuilder.getCar();
        // 查看五菱宏光成品
        yourWuling.info();

    }
}
