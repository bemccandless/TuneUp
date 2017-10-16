package com.bem.development.tuneup.vehicle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by bemccandless on 10/9/17.
 */
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class VehicleControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getVehicles() throws Exception {
        mvc.perform(get("/vehicles").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
