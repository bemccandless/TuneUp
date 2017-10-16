package com.bem.development.tuneup.vehicle;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bemccandless on 10/5/17.
 */
@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {
}
