package org.example.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Person {

   @Getter
   @Setter
    @NonNull
    private int id;

    @Getter
    @Setter
    @EqualsAndHashCode.Include
    private String firstname;

    @Getter
    @Setter
    private String lastname;

    public Person(String lastname,String firstname){
        this.id = 99;
        this.lastname = lastname;
        this.firstname = firstname;
    }
}
