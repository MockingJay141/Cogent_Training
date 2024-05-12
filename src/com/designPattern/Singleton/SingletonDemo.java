package com.designPattern.Singleton;

public class SingletonDemo implements Cloneable{

    private volatile static SingletonDemo _instance;

    private SingletonDemo(){

    }

    /**
     * This is the normal method to make sure only one instance of the singleton class
     * is created.
     * This method is not thread safe and hence using multiple threads may lead to creation of multiple
     * instances of Singleton class
     * @return
     */
    public static SingletonDemo getInstance(){
        if(_instance == null){
            _instance = new SingletonDemo();

        }
        return _instance;
    }

    /**
     * This is the synchronized method to make sure that only one instance is created of the singleton class
     * is created. This method is thread safe hence we can be sure that even if there are multiple threads created
     * still only one instance will be created.
     * The only problem with is method is that since synchronized is called every time it slows the performance.
     * @return
     */
    public static synchronized SingletonDemo getInstanceTS(){
        if (_instance == null){
            _instance = new SingletonDemo();
        }

        return _instance;
    }

    /**
     *
     * @return
     */
    public static SingletonDemo getInstanceDC(){
        if (_instance == null){
            synchronized (SingletonDemo.class){
                if (_instance == null){
                    _instance = new SingletonDemo();
                }
            }
        }
        return _instance;
    }

    @Override
    public SingletonDemo clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    void test(){
        System.out.println("Hello Singleton Test.");
    }
}
