package sharedrmi.application.api;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface UserService extends Remote {

    List<String> getAllTopics() throws RemoteException;

    List<String> getSubscribedTopicsForUser(String username) throws RemoteException;

    void subscribe(String topic) throws RemoteException;

    void unsubscribe(String topic) throws RemoteException;
}
