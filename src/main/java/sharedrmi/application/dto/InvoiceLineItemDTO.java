package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;
import sharedrmi.domain.enums.MediumType;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
public class InvoiceLineItemDTO implements Serializable {

    private final MediumType mediumType;
    private final String name;
    private final int quantity;
    private final BigDecimal price;

    @Builder
    public InvoiceLineItemDTO(MediumType mediumType, String name, int quantity, BigDecimal price) {
        this.mediumType = mediumType;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

}
