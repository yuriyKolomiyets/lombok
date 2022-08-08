package org.example.model;

import lombok.Data;

@Data //combines the features of @ToString, @EqualsAndHashCode, @Getter @Setter, and @RequiredArgsConstructor together
public class Admin {

    private int id;
    private String name;
    private String surname;
    private String birthPlace;


}
