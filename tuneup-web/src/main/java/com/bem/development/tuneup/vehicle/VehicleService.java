package com.bem.development.tuneup.vehicle;

import java.util.List;

/**
 * Created by bemccandless on 10/8/17.
 */
public interface VehicleService {

    public Vehicle getVehicleById(String id);

    public List<Vehicle> getAllVehicles();

    public void saveVehicle(Vehicle vehicle);

    public void deleteVehicle(Vehicle vehicle);

}
