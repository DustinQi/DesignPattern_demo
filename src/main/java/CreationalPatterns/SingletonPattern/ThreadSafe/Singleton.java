package CreationalPatterns.SingletonPattern.ThreadSafe;

/**
 * DCL+懒汉式单例，线程安全
 */
public class Singleton {
    private static volatile Singleton singleton;
    public String name;

    private Singleton(String name){
        this.name = name;
    }

    /**
     * 使用DCL(double-checked locking,双重检验锁)的懒汉式获取单例对象
     */
    public static Singleton getInstance(String name){
        // first-check: 提高性能，避免每个线程都执行synchronized
        if(null == singleton){
            synchronized (Singleton.class){
                // second-check: 可能多个线程通过第一层检验，没有第二层检验会生成多个实例
                if(null == singleton){
                    singleton = new Singleton(name);
                }
            }
        }
        return singleton;
    }
}
