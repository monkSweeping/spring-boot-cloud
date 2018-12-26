package com.mars.oauth.client;

import com.mars.domain.eneity.Resault;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "sso-base",fallback = BaseClientImpl.class)
public interface BaseClient {

    @RequestMapping(value = "/adminInfo/{adminId}",method = RequestMethod.GET)
    Resault getByToken(@PathVariable("adminId") String adminId);
}
