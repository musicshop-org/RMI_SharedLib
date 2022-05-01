package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;
import sharedrmi.domain.enums.MediumType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
public class SongDTO implements Serializable {

    private final String title;
    private final BigDecimal price;
    private final int stock;
    private final MediumType mediumType;
    private final String releaseDate;
    private final String genre;
    private final List<ArtistDTO> artists;
    private final Set<AlbumDTO> inAlbum;

    @Builder
    public SongDTO(String title, BigDecimal price, int stock, MediumType mediumType, String releaseDate, String genre, List<ArtistDTO> artists, Set<AlbumDTO> inAlbum) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.mediumType = mediumType;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.artists = artists;
        this.inAlbum = inAlbum;
    }

}