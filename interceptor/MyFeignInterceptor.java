package org.mohrss.csi.pcbc.core.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Chen Jie
 */
@Component
public class MyFeignInterceptor implements RequestInterceptor {


    private final static Logger logger = LoggerFactory.getLogger(MyFeignInterceptor.class);
    @Override
    public void apply(RequestTemplate template) {
        logger.info("拦截器开始-------");
        logger.info("template :" + template);
        logger.info("拦截器结束-------");
    }
}
