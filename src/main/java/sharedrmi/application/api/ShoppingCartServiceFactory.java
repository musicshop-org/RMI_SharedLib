package application.api;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.UUID;
import application.api.ShoppingCartService;

public interface ShoppingCartServiceFactory extends Remote {
    ShoppingCartService createShoppingCartService(UUID ownerId) throws RemoteException;
}
