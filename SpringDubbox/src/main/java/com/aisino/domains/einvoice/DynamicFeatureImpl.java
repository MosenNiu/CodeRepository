package com.aisino.domains.einvoice;

import com.aisino.domains.einvoice.service.ShortUrlInnerService;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;

/**绑定拦截器到指定地方
 * Created by Mosen on 2017/11/14.
 */
public class DynamicFeatureImpl implements DynamicFeature {
    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext featureContext) {
        //类或子类匹配
        boolean classMatched = ShortUrlInnerService.class.isAssignableFrom(resourceInfo.getResourceClass());
        //方法名匹配
        boolean methodNameMatched = resourceInfo.getResourceMethod().getName().contains("downInner");
        //方法类型匹配
//        boolean methodTypeMatched = resourceInfo.getResourceMethod().isAnnotationPresent(GET.class);

        //匹配成功才注册
//        if (classMatched && (methodNameMatched || methodTypeMatched)) {
        if (classMatched && methodNameMatched) {
            featureContext.register(RestDownInterceptor.class);
        }
    }
}
