package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;
import sharedrmi.domain.enums.MediumType;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
public class CartLineItemDTO implements Serializable {

    private final MediumType mediumType;
    private final String name;
    private final int quantity;
    private final BigDecimal price;
    private final int stock;
    private final String imageUrl;

    @Builder
    public CartLineItemDTO(MediumType mediumType, String name, int quantity, BigDecimal price, int stock, String imageUrl) {
        this.mediumType = mediumType;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.stock = stock;
        this.imageUrl = imageUrl;
    }

}
