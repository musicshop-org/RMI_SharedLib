package sharedrmi.application.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumDTO {

    private final String title;
    private final String label;
    private final LocalDate releaseDate;
    private final String mediumType;
    private final BigDecimal price;
    private final int stock;

    public AlbumDTO(String title, String label, LocalDate releaseDate, String mediumType, BigDecimal price, int stock) {
        this.title = title;
        this.label = label;
        this.releaseDate = releaseDate;
        this.mediumType = mediumType;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public String getLabel() {
        return label;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getMediumType() {
        return mediumType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

}
