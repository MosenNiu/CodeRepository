import dao.BaseDao;
import dao.MybatisSqlKey;
import entity.Factory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Mosen on 2018/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class DaoTest {

    @Autowired
    private BaseDao baseDao;

    @Test
    public void selectTest() {
        System.out.println(1);
        Factory factory = baseDao.selectOne(MybatisSqlKey.SELECT_FACTORY,"1116");
        System.out.println(factory);
    }
}
