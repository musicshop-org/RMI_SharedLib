package sharedrmi.application.api;

import javax.jms.JMSException;
import javax.naming.NoPermissionException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MessageProducerService extends Remote {

    void publish(List<String> topics , String title, String messageText, long expirationDays) throws RemoteException, NoPermissionException;
}
