package sharedrmi.communication.rmi;

import sharedrmi.application.api.ProductService;
import sharedrmi.application.api.ShoppingCartService;
import sharedrmi.domain.valueobjects.Role;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RMIController extends ProductService, ShoppingCartService, Remote {
    List<Role> getRoles() throws RemoteException;
    String getUsername() throws RemoteException;
}
