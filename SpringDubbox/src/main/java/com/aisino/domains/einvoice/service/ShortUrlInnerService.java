package com.aisino.domains.einvoice.service;

import com.aisino.domains.einvoice.entity.Response;
import com.aisino.domains.einvoice.entity.request.ApplyRequest;
import com.aisino.domains.einvoice.entity.request.QueryRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by Mosen on 2017/11/9.
 */
@Path("FPFX")
public interface ShortUrlInnerService {

    /**
     * 内网注册短连接
     * @param applyRequest
     * @return
     */
    @POST
    @Path("apply")
    @Produces({ "application/json;charset=UTF-8" })
    @Consumes({ "application/json;charset=UTF-8" })
    Response applyInner(ApplyRequest applyRequest);


    /**
     * 内网查询短连接
     * @param queryRequest
     * @return
     */
    @POST
    @Path("query")
    @Produces({ "application/json;charset=UTF-8" })
    @Consumes({ "application/json;charset=UTF-8" })
    Response queryInner(QueryRequest queryRequest);

    /**
     * 内网短连接下载
     * @param shortUrl
     * @return
     */
    @GET
    @Path("{shortUrl}")
    @Produces({ "application/json;charset=UTF-8" })
    Response downInner(@PathParam("shortUrl") String shortUrl);

}
