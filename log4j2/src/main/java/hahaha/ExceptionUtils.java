package hahaha;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by Mosen on 2017/12/19.
 */
public class ExceptionUtils {
    /**
     * 获取异常详细信息
     * @param e
     * @return
     */
    public static String getExceptionMsg(Exception e) {
        StringWriter sw=new StringWriter();
        PrintWriter pw=new PrintWriter(sw);
        e.printStackTrace(pw);
        String str = sw.toString();
        try {
            sw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        pw.close();
        return str;
    }
}
