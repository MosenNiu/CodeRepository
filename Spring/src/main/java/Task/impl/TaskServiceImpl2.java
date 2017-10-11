package Task.impl;

import Task.NfsStatus;
import Task.TaskService;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by Mosen on 2017/9/20.
 */
@Component("taskService2")
public class TaskServiceImpl2 implements TaskService {
    private static final Logger LOGGER = getLogger(TaskServiceImpl2.class);
    @Resource(name = "startJob2")
    private Scheduler scheduler2;
    @Autowired
    private NfsStatus nfsStatus;

    public void taskNfsConn(){
        LOGGER.info("定时器测试NFS连接情况，路径为：{}",nfsStatus.getNfsPath2());
        if (nfsStatus.getNfsConn2()) {
            LOGGER.info("NFS路径{}连接正常，停止定时器",nfsStatus.getNfsPath2());
            stop();
        } else {
//            nfsStatus.setNfsConn2(eInvoiceService.nfsConn(nfsStatus.getNfsPath2()));
        }
    }

    public void stop() {
        try {
            scheduler2.standby();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            scheduler2.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }


}
