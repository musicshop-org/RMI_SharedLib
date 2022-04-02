package sharedrmi.domain.valueobjects;

import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Getter
public class InvoiceId implements Serializable {

    private final long id;

    public InvoiceId() {
        this.id = LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();
    }

}
