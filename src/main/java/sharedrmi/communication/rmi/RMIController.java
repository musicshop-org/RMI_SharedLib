package sharedrmi.communication.rmi;

import sharedrmi.application.api.*;
import sharedrmi.domain.valueobjects.Role;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RMIController extends ProductService, ShoppingCartService, InvoiceService, CustomerService, MessageProducerService, Remote {
    List<Role> getRoles() throws RemoteException;
    String getUsername() throws RemoteException;
}
