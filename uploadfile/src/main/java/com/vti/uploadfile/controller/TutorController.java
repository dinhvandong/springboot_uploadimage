package com.vti.uploadfile.controller;

import com.vti.uploadfile.model.ResponseObject;
import com.vti.uploadfile.model.Tutor;
import com.vti.uploadfile.repository.TutorRepository;
import com.vti.uploadfile.service.SequenceGeneratorService;
import jakarta.persistence.SequenceGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RequestMapping("/api/tutor")
@RestController
public class TutorController {

    @Autowired
    TutorRepository tutorRepository;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;


    @GetMapping()
    public ResponseEntity<?> getTutorList()
    {
        return ResponseEntity.status(HttpStatus.OK).body
                (new ResponseObject(200,"Ok", tutorRepository.findAll()));
    }
    @PostMapping("/insertTutor")
    public ResponseEntity<?> createNotification(@RequestBody Tutor tutor)
    {

       // Tutor tutor1 = new Tutor();
        tutor.setId(sequenceGeneratorService.generateSequence(tutor.SEQUENCE_NAME));

//        tutor1.setName(tutor.getName());
//        tutor1.setActive(true);
//        tutor1.setAddress(tutor.getAddress());
//        tutor1.setListSubject(tutor.getListSubject());
        return ResponseEntity.status(HttpStatus.OK).body
                (new ResponseObject(200,"Ok", tutorRepository.save(tutor)));


    }


}
