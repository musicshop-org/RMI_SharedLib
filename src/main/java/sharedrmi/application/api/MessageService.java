package sharedrmi.application.api;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MessageService extends Remote, Runnable {

    void publish (List<String> topics, String title, String message) throws RemoteException;
}
