package sharedrmi.application.api;

import sharedrmi.application.dto.MessageDTO;

import javax.ejb.Remote;
import javax.naming.NoPermissionException;
import java.util.List;

@Remote
public interface MessageProducerService {

    void publish(List<String> topic, MessageDTO messageDTO) throws NoPermissionException;
}
