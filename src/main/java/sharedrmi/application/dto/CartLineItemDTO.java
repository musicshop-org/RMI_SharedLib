package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;
import sharedrmi.domain.enums.MediumType;
import sharedrmi.domain.enums.ProductType;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
public class CartLineItemDTO implements Serializable {

    private MediumType mediumType;
    private String name;
    private int quantity;
    private BigDecimal price;
    private int stock;
    private String imageUrl;
    private ProductType productType;

    public CartLineItemDTO() {
    }

    @Builder
    public CartLineItemDTO(MediumType mediumType, String name, int quantity, BigDecimal price, int stock, String imageUrl, ProductType productType) {
        this.mediumType = mediumType;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.stock = stock;
        this.imageUrl = imageUrl;
        this.productType = productType;
    }

}
