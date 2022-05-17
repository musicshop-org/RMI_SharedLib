package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;
import sharedrmi.domain.enums.MediumType;
import sharedrmi.domain.enums.ProductType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
public class CartLineItemDTO implements Serializable {

    private MediumType mediumType;
    private String name;
    private int quantity;
    private BigDecimal price;
    private int stock;
    private String imageUrl;
    private ProductType productType;
    private Set<String> artists;

    public CartLineItemDTO() {
    }

    public CartLineItemDTO(MediumType mediumType, String name, int quantity, BigDecimal price, int stock, String imageUrl, ProductType productType) {
        this.mediumType = mediumType;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.stock = stock;
        this.imageUrl = imageUrl;
        this.productType = productType;
        this.artists = new HashSet<>();
    }

    @Builder
    public CartLineItemDTO(MediumType mediumType, String name, int quantity, BigDecimal price, int stock, String imageUrl, ProductType productType, List<String> artists) {
        this.mediumType = mediumType;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.stock = stock;
        this.imageUrl = imageUrl;
        this.productType = productType;
        this.artists = new HashSet<>(artists);
    }

}
