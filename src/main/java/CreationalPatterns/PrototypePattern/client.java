package CreationalPatterns.PrototypePattern;

/**
 * 原型模式client端
 */
public class client {
    public static void main(String[] args){
        ConcreteType concreteType1 = new ConcreteType();
        ConcreteType concreteType2 = (ConcreteType) concreteType1.clone();
        if(concreteType1 == concreteType2){
            System.out.println("concreteType1 == concreteType2");
        }else{
            System.out.println("concreteType1 != concreteType2");
        }
    }
}
