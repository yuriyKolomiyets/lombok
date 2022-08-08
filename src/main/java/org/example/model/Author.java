package org.example.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
@EqualsAndHashCode
@Builder

public class Author {
    private int id;
    private String name;
    private String surname;
    private String birthPlace;
}



