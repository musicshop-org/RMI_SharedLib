package sharedrmi.domain.valueobjects;

import java.io.Serializable;
import java.util.UUID;

public class AlbumId implements Serializable {

    private final UUID albumId;

    public AlbumId() {
        this.albumId = UUID.randomUUID();
    }

    public UUID getAlbumId() {
        return albumId;
    }

}