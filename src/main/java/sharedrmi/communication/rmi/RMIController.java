package sharedrmi.communication.rmi;

import sharedrmi.application.api.*;
import sharedrmi.domain.valueobjects.Role;

import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface RMIController extends ProductService, ShoppingCartService, InvoiceService, CustomerService, MessageProducerService, UserService {
    List<Role> getRoles() throws RemoteException;
    String getUsername() throws RemoteException;
}
