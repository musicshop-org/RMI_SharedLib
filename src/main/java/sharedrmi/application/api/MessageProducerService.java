package sharedrmi.application.api;

import sharedrmi.application.dto.MessageDTO;

import javax.naming.NoPermissionException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MessageProducerService extends Remote {

    void publish(List<String> topic, MessageDTO messageDTO) throws RemoteException, NoPermissionException;
}
