package com.aisino.domains.einvoice.service.impl;

import com.aisino.domains.einvoice.entity.Response;
import com.aisino.domains.einvoice.entity.request.ApplyRequest;
import com.aisino.domains.einvoice.entity.request.QueryRequest;
import com.aisino.domains.einvoice.service.ShortUrlOuterService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

/**
 * Created by Mosen on 2017/11/10.
 */
@Service("shortUrlOuterService")
public class ShortUrlOuterServiceImpl implements ShortUrlOuterService {

    @Override
    public Response applyOuter(ApplyRequest applyRequest) {
        System.out.println(666);
        System.out.println(applyRequest);
        return null;
    }

    @Override
    public Response queryOuter(QueryRequest queryRequest) {
        System.out.println(queryRequest);
        return null;
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
