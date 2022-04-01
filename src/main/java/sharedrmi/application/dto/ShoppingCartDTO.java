package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter
public class ShoppingCartDTO implements Serializable {

    private final String ownerId;
    private final List<LineItemDTO> lineItems;

    @Builder
    public ShoppingCartDTO(String ownerId, List<LineItemDTO> lineItems) {
        this.ownerId = ownerId;
        this.lineItems = lineItems;
    }

}
