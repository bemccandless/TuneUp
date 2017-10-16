package com.bem.development.tuneup.vehicle;

import com.bem.development.tuneup.TuneUpApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by bemccandless on 10/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class VehicleRepositoryTest {

    @Autowired
    private VehicleRepository instance;

    @Test
    public void testAddVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setDriver("Brian");
        vehicle.setMake("Honda");
        vehicle.setModel("Civic");
        vehicle.setYear(2005);
        vehicle.setMileage(150000);

        instance.save(vehicle);

        assertNotNull(vehicle.getId());
        instance.delete(vehicle);
    }

    @Configuration
    @Import({TuneUpApplication.class})
    protected static class Config {
    }
}
