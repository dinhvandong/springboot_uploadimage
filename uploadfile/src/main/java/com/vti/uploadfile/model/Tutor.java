package com.vti.uploadfile.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Tutor {

    @Transient
    public static final String SEQUENCE_NAME = "tutor_sequence";

    @Id
    private Long id;

    private String name;

    private String address;

    List<Subject> listSubject;

    private  boolean active;
}
