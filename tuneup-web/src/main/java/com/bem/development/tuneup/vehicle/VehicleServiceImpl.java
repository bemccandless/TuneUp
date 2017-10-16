package com.bem.development.tuneup.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Handles database interactions for Vehicles.
 *
 * Created by bemccandless on 10/8/17.
 */
@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    /**
     * Get a vehicle by id.
     *
     * @param id
     * @return
     */
    public Vehicle getVehicleById(String id) {
        return vehicleRepository.findOne(id);
    }

    /**
     * Get all vehicles.
     *
     * @return
     */
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    /**
     * Save vehicle.
     *
     * @param vehicle
     */
    public void saveVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    /**
     * Delete a vehicle.
     *
     * @param vehicle
     */
    public void deleteVehicle(Vehicle vehicle) {
        vehicleRepository.delete(vehicle);
    }
}
