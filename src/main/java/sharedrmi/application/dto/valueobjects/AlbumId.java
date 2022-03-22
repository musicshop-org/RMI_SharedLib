package sharedrmi.application.dto.valueobjects;

import java.util.UUID;

public class AlbumId {

    private final UUID albumId;

    public AlbumId() {
        this.albumId = UUID.randomUUID();
    }

    public UUID getAlbumId() {
        return albumId;
    }

}