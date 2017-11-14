package com.aisino.domains.einvoice.service.impl;

import com.aisino.domains.einvoice.entity.Response;
import com.aisino.domains.einvoice.entity.request.ApplyRequest;
import com.aisino.domains.einvoice.entity.request.QueryRequest;
import com.aisino.domains.einvoice.service.ShortUrlInnerService;
import com.aisino.domains.einvoice.service.ShortUrlOuterService;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**dubbox接口实现类实现两个暴露接口只有第一个生效
 * Created by Mosen on 2017/11/10.
 */
//@Service("shortUrlService")
public class ShortUrlServiceImpl implements ShortUrlInnerService, ShortUrlOuterService {


    @Override
    public Response applyInner(ApplyRequest applyRequest) {
        return null;
    }

    @Override
    public Response applyOuter(ApplyRequest applyRequest) {
        System.out.println(666);
        System.out.println(applyRequest);
        return null;
    }

    @Override
    public Response queryInner(QueryRequest queryRequest) {
        return null;
    }

    @Override
    public Response queryOuter(QueryRequest queryRequest) {
        System.out.println(queryRequest);
        return null;
    }

    @Override
    public Response downInner(String shortUrl) {
        System.out.println("downInner begin");
        System.out.println(shortUrl);
        Response response = new Response();
        try {
            String data = new String(FileUtils.readFileToByteArray(new File("C:\\Users\\Mosen\\Desktop\\02200150011100029123.pdf")));
            response.setData(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("downInner begin");
        return response;
    }

    @Override
    public Response downOuter(String shortUrl) {
        System.out.println("ooooooooooo");
        System.out.println(shortUrl);
        Response response = new Response();
        try {
            String data = new String(FileUtils.readFileToByteArray(new File("C:\\Users\\Mosen\\Desktop\\02200150011100029123.pdf")));
            response.setData(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
