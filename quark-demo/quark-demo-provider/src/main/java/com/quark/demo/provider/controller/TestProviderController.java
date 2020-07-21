package com.quark.demo.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author afa_s
 */
@RestController
public class TestProviderController {

    // @Autowired
    // private OrderProperties orderProperties;
    //
    // @Value(value = "${order.pay-timeout-seconds}")
    // private Integer payTimeoutSeconds;

    // @GetMapping("/echo")
    // public String echo() {
    //     return "provider:订单支付超时时长(value):" + payTimeoutSeconds + ".订单创建频率(prop):" + orderProperties.getCreateFrequencySeconds();
    // }

    @GetMapping("/echo")
    public String echo() {
        return "provider:";
    }

}
