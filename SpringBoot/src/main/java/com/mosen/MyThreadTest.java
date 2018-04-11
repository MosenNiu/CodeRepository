package com.mosen;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mosen on 2018/2/1.
 */
@Component
public class MyThreadTest {

    //无返回值
    @Async("myExecutor")  //myExecutor即配置线程池的方法名，此处如果不写自定义线程池的方法名，会使用默认的线程池
    public void test(int i) {
//        for (int j=0; j<100; j++) {
//            try {
//                FileUtils.readFileToString(new File("C:\\Users\\Mosen\\Desktop\\nsrxxFail.txt"),"utf-8");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getId()+"test"+i+" started.");
    }

    //有返回值
    @Async("myExecutor")  //myExecutor即配置线程池的方法名，此处如果不写自定义线程池的方法名，会使用默认的线程池
    public Future<String> test1(int i) {
//        for (int j=0; j<100; j++) {
//            try {
//                FileUtils.readFileToString(new File("C:\\Users\\Mosen\\Desktop\\nsrxxFail.txt"),"utf-8");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getId()+"test1："+i+" started.");
        return new AsyncResult<String>("hello world !!!!"+i);
    }

    //返回结果处理
    @Async("myExecutor")  //myExecutor即配置线程池的方法名，此处如果不写自定义线程池的方法名，会使用默认的线程池
    public void overOne(Future<String> future) {
//        if (future.isDone()) {
            try {
                //返回结果，最长等待5S
                Object obj = future.get(5, TimeUnit.SECONDS);
                System.out.println(obj);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                //关闭进程，防止阻塞
                future.cancel(true);
            }
//        }
    }

}
