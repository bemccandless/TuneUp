package com.bem.development.tuneup.vehicle;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by bemccandless on 10/8/17.
 */
public class VehicleResourceAssemblerTest {

    private VehicleResourceAssembler instance;

    @Before
    public void setUp() throws Exception {
        instance = new VehicleResourceAssembler();
    }

    @Test
    public void toReource() throws Exception {
        Vehicle vehicle = new Vehicle();
        vehicle.setDriver("TestDummy");
        vehicle.setMake("Honda");
        vehicle.setModel("Civic");
        vehicle.setYear(2000);
        vehicle.setMileage(150000);

        VehicleResource result = instance.toReource(vehicle);

        assertNotNull(result);
        assertEquals(vehicle.getDriver(), result.getDriver());
        assertEquals(vehicle.getMake(), result.getMake());
        assertEquals(vehicle.getModel(), result.getModel());
        assertEquals(vehicle.getYear(), result.getYear());
        assertEquals(vehicle.getMileage(), result.getMileage());
    }

    @Test
    public void toResources() throws Exception {
        List<VehicleResource> results = instance.toResources(Arrays.asList(new Vehicle()));

        assertNotNull(results);
        assertEquals(1, results.size());
    }

}