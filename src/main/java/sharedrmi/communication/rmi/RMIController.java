package sharedrmi.communication.rmi;

import sharedrmi.application.api.*;
import sharedrmi.domain.valueobjects.Role;

import java.io.Serializable;
import java.nio.file.AccessDeniedException;
import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.Remote;
import javax.security.auth.login.FailedLoginException;

@Remote
public interface RMIController extends ProductService, ShoppingCartService, InvoiceService, CustomerService, MessageProducerService, UserService, Serializable {
    List<Role> getRoles();
    String getUsername();
}
