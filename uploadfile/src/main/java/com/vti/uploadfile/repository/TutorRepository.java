package com.vti.uploadfile.repository;

import com.vti.uploadfile.model.Tutor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TutorRepository  extends MongoRepository<Tutor, String> {

}
