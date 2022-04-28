package sharedrmi.communication.rmi;

import sharedrmi.application.api.*;
import sharedrmi.domain.valueobjects.Role;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface RMIController extends ProductService, ShoppingCartService, InvoiceService, CustomerService, MessageProducerService, UserService, Serializable {
    List<Role> getRoles();
    String getUsername();
}
