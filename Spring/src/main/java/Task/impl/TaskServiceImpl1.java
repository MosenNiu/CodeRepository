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
@Component("taskService1")
public class TaskServiceImpl1 implements TaskService {
    private static final Logger LOGGER = getLogger(TaskServiceImpl1.class);
    @Resource(name = "startJob1")
    private Scheduler scheduler1;
    @Autowired
    private NfsStatus nfsStatus;

    public void taskNfsConn(){
        LOGGER.info("定时器测试NFS连接情况，路径为：{}",nfsStatus.getNfsPath1());
        if (nfsStatus.getNfsConn1()) {
            LOGGER.info("NFS路径{}连接正常，停止定时器",nfsStatus.getNfsPath1());
            stop();
        } else {
//            nfsStatus.setNfsConn1(eInvoiceService.nfsConn(nfsStatus.getNfsPath1()));
        }
    }

    public void stop() {
        try {
            scheduler1.standby();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            scheduler1.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }


}
