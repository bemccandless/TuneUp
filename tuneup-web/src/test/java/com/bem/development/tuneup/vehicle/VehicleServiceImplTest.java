package com.bem.development.tuneup.vehicle;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by bemccandless on 10/8/17.
 */
public class VehicleServiceImplTest {

    @InjectMocks
    private VehicleService instance;

    @Mock
    private VehicleRepository vehicleRepository;

    @Before
    public void setUp() throws Exception {
        instance = new VehicleServiceImpl();

        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getVehicleById() throws Exception {
        String vehicleId = "123";
        when(vehicleRepository.findOne(vehicleId)).thenReturn(new Vehicle());

        Vehicle result = instance.getVehicleById(vehicleId);
        verify(vehicleRepository).findOne(vehicleId);

        assertNotNull(result);
    }

    @Test
    public void getAllVehicles() throws Exception {
        when(vehicleRepository.findAll()).thenReturn(Arrays.asList(new Vehicle()));

        List<Vehicle> results = instance.getAllVehicles();
        verify(vehicleRepository).findAll();

        assertNotNull(results);
        assertFalse(results.isEmpty());
    }

    @Test
    public void saveVehicle() throws Exception {
        Vehicle vehicle = new Vehicle();
        when(vehicleRepository.save(vehicle)).thenReturn(vehicle);

        instance.saveVehicle(vehicle);
        verify(vehicleRepository).save(vehicle);
    }

    @Test
    public void deleteVehicle() throws Exception {
        Vehicle vehicle = new Vehicle();
        doNothing().when(vehicleRepository).delete(vehicle);

        instance.deleteVehicle(vehicle);
        verify(vehicleRepository).delete(vehicle);
    }

}