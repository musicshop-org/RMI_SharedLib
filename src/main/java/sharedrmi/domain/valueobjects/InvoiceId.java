package sharedrmi.domain.valueobjects;

import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Getter
public class InvoiceId implements Serializable {

    private final long invoiceId;

    public InvoiceId() {
        this.invoiceId = LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();
    }

}
