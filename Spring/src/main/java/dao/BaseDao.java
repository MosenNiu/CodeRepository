package dao;

import java.util.List;

/**
 * Created by Mosen on 2017/10/12.
 */
public interface BaseDao {

    <T> T selectOne(String sqlKey, Object parameter);
    <T> List<T> selectList(String sqlKey, Object parameter);
    int update(String sqlKey, Object parameter);
    int insert(String sqlKey, Object parameter);
    int delete(String sqlKey, Object parameter);
}
