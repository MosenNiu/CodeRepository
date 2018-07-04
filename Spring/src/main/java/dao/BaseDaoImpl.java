package dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Mosen on 2017/10/12.
 */
@Repository("baseDao")
public class BaseDaoImpl implements BaseDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public <T> T selectOne(String sqlKey, Object parameter) {
        return sqlSessionTemplate.selectOne(sqlKey, parameter);
    }

    @Override
    public <T> List<T> selectList(String sqlKey, Object parameter) {
        return sqlSessionTemplate.selectList(sqlKey, parameter);
    }

    @Override
    public int update(String sqlKey, Object parameter) {
        return sqlSessionTemplate.update(sqlKey, parameter);
    }

    @Override
    public int insert(String sqlKey, Object parameter) {
        return sqlSessionTemplate.insert(sqlKey, parameter);
    }

    @Override
    public int delete(String sqlKey, Object parameter) {
        return sqlSessionTemplate.delete(sqlKey, parameter);
    }
}
