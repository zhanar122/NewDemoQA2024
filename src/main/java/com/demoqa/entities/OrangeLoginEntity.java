package com.demoqa.entities;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class OrangeLoginEntity {
    private String userName;
    private String password;


    public OrangeLoginEntity() {

    }
}
