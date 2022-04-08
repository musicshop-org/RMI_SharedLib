package sharedrmi.application.api;

import sharedrmi.application.dto.AlbumDTO;
import sharedrmi.application.dto.CartLineItemDTO;
import sharedrmi.application.dto.ShoppingCartDTO;

import javax.naming.NoPermissionException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ShoppingCartService extends Remote{

    ShoppingCartDTO getCart() throws RemoteException, NoPermissionException;

    void addProductToCart(AlbumDTO album, int amount) throws RemoteException, NoPermissionException;

    void changeQuantity(CartLineItemDTO cartLineItemDTO, int quantity) throws RemoteException, NoPermissionException;

    void removeProductFromCart(CartLineItemDTO cartLineItemDTO) throws RemoteException, NoPermissionException;

    void clearCart() throws RemoteException, NoPermissionException;

}
