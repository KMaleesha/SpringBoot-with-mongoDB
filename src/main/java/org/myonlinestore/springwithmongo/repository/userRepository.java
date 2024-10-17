package org.myonlinestore.springwithmongo.repository;

import org.myonlinestore.springwithmongo.model.userModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<userModel, String> {
}
