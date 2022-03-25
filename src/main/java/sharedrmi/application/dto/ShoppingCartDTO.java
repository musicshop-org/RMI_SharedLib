package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
public class ShoppingCartDTO {

    private final UUID ownerId;
    private final List<LineItemDTO> lineItems;

    @Builder
    public ShoppingCartDTO(UUID ownerId, List<LineItemDTO> lineItems) {
        this.ownerId = ownerId;
        this.lineItems = lineItems;
    }

}
