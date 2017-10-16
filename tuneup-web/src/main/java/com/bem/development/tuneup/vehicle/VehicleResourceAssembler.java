package com.bem.development.tuneup.vehicle;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by bemccandless on 10/8/17.
 */
@Component
public class VehicleResourceAssembler {

    public VehicleResource toReource(Vehicle entity) {
        VehicleResource resource = new VehicleResource();
        resource .setDriver(entity.getDriver());
        resource.setMake(entity.getMake());
        resource.setModel(entity.getModel());
        resource.setYear(entity.getYear());
        resource.setMileage(entity.getMileage());

        return resource;
    }

    public List<VehicleResource> toResources(List<Vehicle> entities) {
        return entities.stream()
                .map(this::toReource)
                .collect(Collectors.toList());
    }
}
