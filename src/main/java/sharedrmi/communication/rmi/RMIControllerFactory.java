package sharedrmi.communication.rmi;

import javax.security.auth.login.FailedLoginException;
import java.nio.file.AccessDeniedException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIControllerFactory extends Remote {

    RMIController createRMIController(String username, String password) throws FailedLoginException, RemoteException, AccessDeniedException;

}