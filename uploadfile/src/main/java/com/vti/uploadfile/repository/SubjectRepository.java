package com.vti.uploadfile.repository;

import com.vti.uploadfile.model.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository  extends MongoRepository<Subject, String> {
}
