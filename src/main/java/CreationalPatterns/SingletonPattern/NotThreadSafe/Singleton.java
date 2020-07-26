package CreationalPatterns.SingletonPattern.NotThreadSafe;

/**
 * 懒汉式单例，线程不安全
 */
public class Singleton {
    private static Singleton singleton;
    public String name;

    private Singleton(String name){
        this.name = name;
    }

    public static Singleton getInstance(String name){
        if(null == singleton){
            singleton = new Singleton(name);
        }
        return singleton;
    }
}
