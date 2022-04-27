package sharedrmi.application.api;

import sharedrmi.application.exceptions.UserNotFoundException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.List;

public interface UserService extends Remote {

    List<String> getAllTopics() throws RemoteException;

    List<String> getSubscribedTopicsForUser(String username) throws RemoteException;

    void changeLastViewed(String username, LocalDateTime lastViewed) throws UserNotFoundException, RemoteException;

    LocalDateTime getLastViewedForUser(String username) throws RemoteException, UserNotFoundException;

    boolean subscribe(String topic, String username) throws RemoteException;

    boolean unsubscribe(String topic, String username) throws RemoteException;
}
