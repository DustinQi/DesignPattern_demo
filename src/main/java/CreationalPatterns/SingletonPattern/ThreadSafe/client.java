package CreationalPatterns.SingletonPattern.ThreadSafe;

import CreationalPatterns.SingletonPattern.NotThreadSafe.Singleton;

/**
 * 线程安全单例模式，客户端测试代码
 */
public class client {
    public static void main(String[] args){
        // 多线程测试
        Thread thread1 = new Thread(new CreationalPatterns.SingletonPattern.ThreadSafe.client.thread1());
        Thread thread2 = new Thread(new CreationalPatterns.SingletonPattern.ThreadSafe.client.thread2());
        thread1.start();  // "singleton1"
        thread2.start();  // "singleton1"
    }

    static class thread1 implements Runnable { // 内部的有static方法，这里类前不加static会报错

        @Override
        public void run() {
            CreationalPatterns.SingletonPattern.NotThreadSafe.Singleton singleton3 = CreationalPatterns.SingletonPattern.NotThreadSafe.Singleton.getInstance("singleton1");
            System.out.println(singleton3.name);
        }
    }

    static class thread2 implements Runnable {

        @Override
        public void run() {
            CreationalPatterns.SingletonPattern.NotThreadSafe.Singleton singleton4 = Singleton.getInstance("singleton2");
            System.out.println(singleton4.name);
        }
    }
}
