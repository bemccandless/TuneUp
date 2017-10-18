package com.bem.development.tuneup.config;

import com.bem.development.tuneup.login.FacebookProperties;
import com.bem.development.tuneup.vehicle.VehicleService;
import com.bem.development.tuneup.vehicle.VehicleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bemccandless on 10/6/17.
 */
@Configuration
public class AppConfig {

    @Bean
    public VehicleService vehicleService() {
        return new VehicleServiceImpl();
    }

    @Bean
    public FacebookProperties facebook() {
        return new FacebookProperties();
    }
}
