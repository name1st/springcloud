package com.kuang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wonders on 2020-01-12 09:26
 */
@Configuration
public class KuangRule {

    @Bean
    public IRule myRule(){

        return new RoundRobinRule();
    }
}
