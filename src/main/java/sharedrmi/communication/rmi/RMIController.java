package sharedrmi.communication.rmi;

import sharedrmi.application.api.ProductService;
import sharedrmi.application.api.ShoppingCartService;

import javax.management.relation.Role;
import java.rmi.Remote;
import java.util.List;

public interface RMIController extends ProductService, ShoppingCartService, Remote {
    List<Role> getRoles();
    String getUsername();
}
