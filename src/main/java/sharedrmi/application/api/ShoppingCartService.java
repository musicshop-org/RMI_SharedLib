package sharedrmi.application.api;

import sharedrmi.application.dto.AlbumDTO;
import sharedrmi.application.dto.LineItemDTO;
import sharedrmi.application.dto.ShoppingCartDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ShoppingCartService extends Remote{

    ShoppingCartDTO getCart() throws RemoteException;

    void addProductToCart(AlbumDTO album, int amount) throws RemoteException;

    void changeQuantity(LineItemDTO lineItemDTO, int quantity) throws RemoteException;

    void removeProductFromCart(LineItemDTO lineItemDTO) throws RemoteException;

}
