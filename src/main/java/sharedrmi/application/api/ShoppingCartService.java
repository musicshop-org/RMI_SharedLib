package sharedrmi.application.api;

import sharedrmi.application.dto.AlbumDTO;
import sharedrmi.application.dto.CartLineItemDTO;
import sharedrmi.application.dto.ShoppingCartDTO;

import javax.ejb.Remote;
import javax.naming.NoPermissionException;

@Remote
public interface ShoppingCartService{

    ShoppingCartDTO getCart() throws NoPermissionException;

    void addProductToCart(AlbumDTO album, int amount) throws NoPermissionException;

    void changeQuantity(CartLineItemDTO cartLineItemDTO, int quantity) throws NoPermissionException;

    void removeProductFromCart(CartLineItemDTO cartLineItemDTO) throws NoPermissionException;

    void clearCart() throws NoPermissionException;

}
