package sharedrmi.application.dto;

import sharedrmi.domain.enums.MediumType;
import sharedrmi.domain.valueobjects.AlbumId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

public class AlbumDTO implements Serializable {

    private final String title;
    private final BigDecimal price;
    private final int stock;
    private final MediumType mediumType;
    private final LocalDate releaseDate;
    private final AlbumId albumId;
    private final String label;
    private final Set<SongDTO> songs;

    public AlbumDTO(String title, BigDecimal price, int stock, MediumType mediumType, LocalDate releaseDate, AlbumId albumId, String label, Set<SongDTO> songs) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.mediumType = mediumType;
        this.releaseDate = releaseDate;
        this.albumId = albumId;
        this.label = label;
        this.songs = songs;
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

    public AlbumId getAlbumId() {
        return albumId;
    }

    public String getLabel() {
        return label;
    }

    public Set<SongDTO> getSongs() {
        return songs;
    }

}
