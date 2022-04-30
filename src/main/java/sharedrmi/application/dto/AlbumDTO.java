package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;
import sharedrmi.domain.enums.MediumType;
import sharedrmi.domain.valueobjects.AlbumId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Getter
public class AlbumDTO implements Serializable {

    private final String title;
    private final BigDecimal price;
    private final int stock;
    private final MediumType mediumType;
    private final String releaseDate;
    private final AlbumId albumId;
    private final String label;
    private final Set<SongDTO> songs;
    private int quantityToAddToCart;

    @Builder
    public AlbumDTO(String title, BigDecimal price, int stock, MediumType mediumType, String releaseDate, AlbumId albumId, String label, Set<SongDTO> songs, int quantityToAddToCart) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.mediumType = mediumType;
        this.releaseDate = releaseDate;
        this.albumId = albumId;
        this.label = label;
        this.songs = songs;
        this.quantityToAddToCart = quantityToAddToCart;
    }

}
