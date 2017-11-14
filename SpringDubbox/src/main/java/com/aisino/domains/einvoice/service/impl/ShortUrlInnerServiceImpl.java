package com.aisino.domains.einvoice.service.impl;

import com.aisino.domains.einvoice.entity.Response;
import com.aisino.domains.einvoice.entity.request.ApplyRequest;
import com.aisino.domains.einvoice.entity.request.QueryRequest;
import com.aisino.domains.einvoice.service.ShortUrlInnerService;
import org.springframework.stereotype.Service;

/**
 * Created by Mosen on 2017/11/10.
 */
@Service("shortUrlInnerService")
public class ShortUrlInnerServiceImpl implements ShortUrlInnerService {

    @Override
    public Response applyInner(ApplyRequest applyRequest) {
        return null;
    }

    @Override
    public Response queryInner(QueryRequest queryRequest) {
        return null;
    }

    @Override
    public Response downInner(String shortUrl) {
        System.out.println("downInner begin");
        System.out.println(shortUrl);
        Response response = new Response();
        response.setData("srtfhxfg");
//        try {
//            String data = new String(FileUtils.readFileToByteArray(new File("C:\\Users\\Mosen\\Desktop\\02200150011100029123.pdf")));
//            response.setData(data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println("downInner end");
        return response;
    }

}
