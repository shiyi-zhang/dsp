package com.pxene.odin.cloud.web.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangshiyi
 */
@FeignClient(name = "ODIN-CLOUD-CHANNEL-SERVICE")
public interface ImageSizeClient {

    @GetMapping(value = "/sizes")
    String listSizes();
}
