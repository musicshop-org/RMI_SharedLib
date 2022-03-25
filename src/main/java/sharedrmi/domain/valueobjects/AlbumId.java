package sharedrmi.domain.valueobjects;

import lombok.Getter;

import java.io.Serializable;
import java.util.UUID;

@Getter
public class AlbumId implements Serializable {

    private final UUID albumId;

    public AlbumId() {
        this.albumId = UUID.randomUUID();
    }

}