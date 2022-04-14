package sharedrmi.application.api;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MessageProducerService extends Remote {

    void publish(List<String> topics , String title, String messageText) throws RemoteException;
}
