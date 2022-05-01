package sharedrmi.communication.rmi;

import javax.ejb.Remote;
import javax.security.auth.login.FailedLoginException;
import java.nio.file.AccessDeniedException;
import java.rmi.RemoteException;

@Remote
public interface RMIControllerFactory {

    RMIController createRMIController(String username, String password) throws FailedLoginException, RemoteException, AccessDeniedException;

}