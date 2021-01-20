package org.jeecg.modules.ols.utils;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.aspect.annotation.Dict;
import org.jeecg.modules.ols.constant.DictConst;
import org.jeecg.modules.ols.repeatJob.service.IOlsRepeatJobService;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * bean操作
 */
@Slf4j
@Component
public class BeanHelper {
    private final DictCodeHelper dictCodeHelper;
    @Autowired
    BeanHelper(DictCodeHelper dictCodeHelper){
        this.dictCodeHelper = dictCodeHelper;
    }

    /**
     * bean修改记录
     *
     * @param t1 原始数据
     * @param t2 修改后数据，null字段不统计
     * @param <T>
     * @return 返回string 字段[name]由'****'变更为'***'
     */
    public <T> String beanChangeInfo(T t1, T t2) {

        Class clazz = t1.getClass();
        Field[] fields = clazz.getDeclaredFields();
        String changeInfo = "";

        try {
            for(Field field: fields){
                field.setAccessible(true); // 私有属性必须设置访问权限
                Object resultValue1 = field.get(t1);
                Object resultValue2 = field.get(t2);

                if ((resultValue2 != null) && !resultValue2.equals(resultValue1)) {

                    String name = field.getName();
                    //判断字段注解是否存在
                    boolean annotationPresent = field.isAnnotationPresent(Excel.class);
                    if (annotationPresent) {
                        Excel excelAnnotation = field.getAnnotation(Excel.class);
                        // 获取注解值
                        name = excelAnnotation.name();
                    }
                    //判断字段注解是否存在
                    boolean annotationPresent2 = field.isAnnotationPresent(Dict.class);
                    if (annotationPresent2) {
                        Dict dictAnnotation = field.getAnnotation(Dict.class);
                        Map<String, String> dictMap = dictCodeHelper.getValue2TextMap(dictAnnotation.dicCode());
                        resultValue1 = dictMap.get(resultValue1.toString());
                        resultValue2 = dictMap.get(resultValue2.toString());
                    }

                    changeInfo +="["+name+"]由\""+resultValue1+"\"变更为\""+resultValue2+"\";";
                }
            }
        } catch (IllegalAccessException e) {
            log.error("获取映射属性出错,类名{},错误信息：{}",clazz.getName(),e);
            changeInfo = "InfoError";
        }

        return changeInfo;
    }

}
