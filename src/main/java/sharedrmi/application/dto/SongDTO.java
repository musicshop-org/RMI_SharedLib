package sharedrmi.application.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SongDTO {

    private final String title;
    private final LocalDate releaseDate;
    private final String genre;
    private final int length;
    private final String mediumType;
    private final BigDecimal price;
    private final int stock;

    public SongDTO(String title, LocalDate releaseDate, String genre, int length, String mediumType, BigDecimal price, int stock) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.length = length;
        this.mediumType = mediumType;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public int getLength() {
        return length;
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