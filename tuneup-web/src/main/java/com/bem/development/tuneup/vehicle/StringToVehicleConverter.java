package com.bem.development.tuneup.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by bemccandless on 10/9/17.
 */
public class StringToVehicleConverter implements Converter<String, Vehicle> {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle convert(String id) {
        return vehicleRepository.findOne(id);
    }

}
