package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class ArtistDTO implements Serializable {

    private final String name;

    @Builder
    public ArtistDTO(String name) {
        this.name = name;
    }

}
