package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class CustomerDTO implements Serializable {

    private final String firstName;
    private final String lastName;
    private final String email;

    @Builder
    public CustomerDTO(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
