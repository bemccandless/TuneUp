package com.bem.development.tuneup.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Maintains a level of control between the data layer and the view layer for Vehicles.
 *
 * Created by bemccandless on 10/8/17.
 */
@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private VehicleResourceAssembler vehicleResourceAssembler;

    /**
     * Get all vehicles.
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getVehicles() {
        return new ResponseEntity(vehicleResourceAssembler.toResources(vehicleService.getAllVehicles()), HttpStatus.OK);
    }

    /**
     * Get vehicle.
     *
     * @param vehicle
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{vehicle}")
    public ResponseEntity getVehicle(@PathVariable Vehicle vehicle) {
        return new ResponseEntity(vehicleResourceAssembler.toReource(vehicle), HttpStatus.OK);
    }

    /**
     * Create vehicle.
     *
     * @param vehicle
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.saveVehicle(vehicle);

        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Update vehicle.
     *
     * @param vehicle
     */
    @RequestMapping(method = RequestMethod.PUT, path = "/{vehicle}")
    public ResponseEntity updateVehicle(@PathVariable Vehicle vehicle) {
        vehicleService.saveVehicle(vehicle);

        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Delete a vehicle.
     *
     * @param vehicle
     */
    @RequestMapping(method = RequestMethod.DELETE, path = "/{vehicle}")
    public ResponseEntity deleteVehicle(@PathVariable Vehicle vehicle) {
//        eventService.deleteEventsForVehicle(vehicle);
//        maintenanceService.deleteMaintenanceItemsForVehicle(vehicle);
        vehicleService.deleteVehicle(vehicle);

        return new ResponseEntity(HttpStatus.OK);
    }

}

