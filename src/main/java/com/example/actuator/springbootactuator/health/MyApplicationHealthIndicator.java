package com.example.actuator.springbootactuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by Blake on 2018/10/7
 */
@Component
public class MyApplicationHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {

        // Health.up().build();  表示服务健康

        return Health.down().withDetail("message", "服务异常").build();
    }
}
