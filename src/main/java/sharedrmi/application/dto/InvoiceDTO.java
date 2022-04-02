package sharedrmi.application.dto;

import lombok.Builder;
import lombok.Getter;
import sharedrmi.domain.enums.CustomerType;
import sharedrmi.domain.enums.PaymentMethod;
import sharedrmi.domain.valueobjects.InvoiceId;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
public class InvoiceDTO implements Serializable {

    private final InvoiceId invoiceId;
    private final List<InvoiceLineItemDTO> invoiceLineItems;
    private final PaymentMethod paymentMethod;
    private final CustomerType customerType;
    private final LocalDate date;

    @Builder
    public InvoiceDTO(InvoiceId invoiceId, List<InvoiceLineItemDTO> invoiceLineItems, PaymentMethod paymentMethod, CustomerType customerType, LocalDate date) {
        this.invoiceId = invoiceId;
        this.invoiceLineItems = invoiceLineItems;
        this.paymentMethod = paymentMethod;
        this.customerType = customerType;
        this.date = date;
    }

}
