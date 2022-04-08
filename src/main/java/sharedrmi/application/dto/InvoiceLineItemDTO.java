package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;
import sharedrmi.domain.enums.MediumType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

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

    public static List<InvoiceLineItemDTO> createFromCartLineItemDTOs(List<CartLineItemDTO> cartLineItemDTOs){
        return cartLineItemDTOs
                .stream()
                .map(cartLineItemDTO ->
                        InvoiceLineItemDTO.builder()
                                .mediumType(cartLineItemDTO.getMediumType())
                                .name(cartLineItemDTO.getName())
                                .quantity(cartLineItemDTO.getQuantity())
                                .price(cartLineItemDTO.getPrice()).build())
                .collect(Collectors.toList());
    }
}
