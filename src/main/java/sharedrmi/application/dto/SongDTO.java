package sharedrmi.application.dto;

import sharedrmi.domain.enums.MediumType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class SongDTO implements Serializable {

    private final String title;
    private final BigDecimal price;
    private final int stock;
    private final MediumType mediumType;
    private final LocalDate releaseDate;
    private final String genre;
    private final List<ArtistDTO> artists;
    private final Set<AlbumDTO> inAlbum;

    public SongDTO(String title, BigDecimal price, int stock, MediumType mediumType, LocalDate releaseDate, String genre, List<ArtistDTO> artists, Set<AlbumDTO> inAlbum) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.mediumType = mediumType;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.artists = artists;
        this.inAlbum = inAlbum;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public MediumType getMediumType() {
        return mediumType;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public List<ArtistDTO> getArtists() {
        return artists;
    }

    public Set<AlbumDTO> getInAlbum() {
        return inAlbum;
    }
}