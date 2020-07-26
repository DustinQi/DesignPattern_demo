package CreationalPatterns.SingletonPattern.NotThreadSafe;

/**
 * 线程不安全单例模式，客户端测试代码
 */
public class client {
    public static void main(String[] args) {
        // 单线程测试
//        Singleton singleton1 = Singleton.getInstance("singleton1");
//        Singleton singleton2 = Singleton.getInstance("singleton2");
//        System.out.println(singleton1.name); // "singleton1"
//        System.out.println(singleton2.name); // "singleton1"
        // 多线程测试
        Thread thread1 = new Thread(new thread1());
        Thread thread2 = new Thread(new thread2());
        thread1.start();  // "singleton1"
        thread2.start();  // "singleton2"
    }

    static class thread1 implements Runnable { // 内部的有static方法，这里类前不加static会报错

        @Override
        public void run() {
            Singleton singleton3 = Singleton.getInstance("singleton1");
            System.out.println(singleton3.name);
        }
    }

    static class thread2 implements Runnable {

        @Override
        public void run() {
            Singleton singleton4 = Singleton.getInstance("singleton2");
            System.out.println(singleton4.name);
        }
    }
}
