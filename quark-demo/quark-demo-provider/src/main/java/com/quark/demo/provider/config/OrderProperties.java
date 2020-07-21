// package com.quark.demo.provider.config;
//
// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.stereotype.Component;
//
// @Component
// @ConfigurationProperties(prefix = "order")
// // @NacosConfigurationProperties(prefix = "order", dataId = "${nacos.config.data-id}", type = ConfigType.YAML)
// public class OrderProperties {
//
//     /**
//      * 订单支付超时时长，单位：秒。
//      */
//     private Integer payTimeoutSeconds;
//
//     /**
//      * 订单创建频率，单位：秒
//      */
//     private Integer createFrequencySeconds;
//
//     public Integer getPayTimeoutSeconds() {
//         return payTimeoutSeconds;
//     }
//
//     public void setPayTimeoutSeconds(Integer payTimeoutSeconds) {
//         this.payTimeoutSeconds = payTimeoutSeconds;
//     }
//
//     public Integer getCreateFrequencySeconds() {
//         return createFrequencySeconds;
//     }
//
//     public void setCreateFrequencySeconds(Integer createFrequencySeconds) {
//         this.createFrequencySeconds = createFrequencySeconds;
//     }
// }
