package sharedrmi.application.dto;

import java.io.Serializable;

public class ArtistDTO implements Serializable {
    private final String name;

    public ArtistDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
