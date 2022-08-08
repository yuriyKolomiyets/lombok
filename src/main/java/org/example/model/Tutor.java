package org.example.model;

import lombok.Value;

@Value // is the immutable variant of @Data. This means that all fields are made private and final by Lombok by default
public class Tutor {
    int id;
    String name;
    String surname;
    String birthPlace;
}
