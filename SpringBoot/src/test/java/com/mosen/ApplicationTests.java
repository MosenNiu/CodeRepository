package com.mosen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ApplicationTests {

	@Autowired
	private MyThreadTest myThreadTest;

	@Test
	public void contextLoads() {
	}

	@Test
//	@Async("myExecutor")
	public void myThreadTest() {
		System.out.println(Thread.currentThread().getId()+"for开始");
		int j= 0;
		int k= 0;
		for (int i = 0; i < 100; i++) {
//			int finalI = i;
//			FutureTask<Boolean> futureTask = new FutureTask<Boolean>(new Callable() {
//				@Override
//				public String call() throws Exception {
//					return myThreadTest.test(finalI);
//				}
//			});
//			myExecutor.execute(futureTask);
//			try {
//				//返回结果，最长等待5S
//				futureTask.get(5,TimeUnit.SECONDS);
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally {
//				//关闭进程，防止阻塞
//				futureTask.cancel(true);
//			}
			myThreadTest.test(i);
			Future future = myThreadTest.test1(i);
			myThreadTest.overOne(future);
			j++;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getId()+"for结束");
		System.out.println("over"+j+","+k);
	}

}
