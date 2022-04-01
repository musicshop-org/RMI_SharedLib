package sharedrmi.application.api;

import sharedrmi.application.dto.AlbumDTO;
import sharedrmi.application.dto.LineItemDTO;
import sharedrmi.application.dto.ShoppingCartDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ShoppingCartService {

    ShoppingCartDTO getCart();

    void addProductToCart(AlbumDTO album, int amount);

    void changeQuantity(LineItemDTO lineItemDTO, int quantity);

    void removeProductFromCart(LineItemDTO lineItemDTO);

}
