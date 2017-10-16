package com.bem.development.tuneup.vehicle;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by bemccandless on 10/9/17.
 */
public class VehicleControllerTest {

    @InjectMocks
    private VehicleController instance;

    @Mock
    private VehicleService vehicleService;

    @Mock
    private VehicleResourceAssembler vehicleResourceAssembler;

    @Before
    public void setUp() throws Exception {
        instance = new VehicleController();

        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getVehicles() throws Exception {
        List<Vehicle> vehicles = new ArrayList();

        when(vehicleService.getAllVehicles()).thenReturn(vehicles);
        when(vehicleResourceAssembler.toResources(vehicles)).thenReturn(new ArrayList());

        ResponseEntity<VehicleResource> result = instance.getVehicles();
        verify(vehicleService).getAllVehicles();
        verify(vehicleResourceAssembler).toResources(vehicles);

        assertNotNull(result);
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }

    @Test
    public void createVehicle() throws Exception {
        Vehicle vehicle = new Vehicle();

        doNothing().when(vehicleService).saveVehicle(vehicle);

        ResponseEntity<VehicleResource> result = instance.createVehicle(vehicle);
        verify(vehicleService).saveVehicle(vehicle);

        assertNotNull(result);
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }

    @Test
    public void updateVehicle() throws Exception {
        Vehicle vehicle = new Vehicle();

        doNothing().when(vehicleService).saveVehicle(vehicle);

        ResponseEntity<VehicleResource> result = instance.updateVehicle(vehicle);
        verify(vehicleService).saveVehicle(vehicle);

        assertNotNull(result);
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }

    @Test
    public void deleteVehicle() throws Exception {
    }

}