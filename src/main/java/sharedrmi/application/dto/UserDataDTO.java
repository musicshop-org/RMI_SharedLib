package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;
import java.io.Serializable;

@Getter
public class UserDataDTO implements Serializable {

    private String username;
    private String password;

    public UserDataDTO(){}

    @Builder
    public UserDataDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
