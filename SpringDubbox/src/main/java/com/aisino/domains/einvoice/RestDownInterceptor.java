package com.aisino.domains.einvoice;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;
import java.io.IOException;

/**下载拦截器
 * Created by Mosen on 2017/11/13.
 */
public class RestDownInterceptor implements WriterInterceptor {


    @Override
    public void aroundWriteTo(WriterInterceptorContext writerInterceptorContext) throws IOException, WebApplicationException {
        System.out.println("interceptor  begin!!!!!");
        System.out.println(writerInterceptorContext.getEntity());
        System.out.println(writerInterceptorContext.getHeaders());
        System.out.println("interceptor  end!!!");
        writerInterceptorContext.proceed();
    }

}
