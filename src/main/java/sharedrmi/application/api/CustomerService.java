package sharedrmi.application.api;

import sharedrmi.application.dto.CustomerDTO;

import javax.ejb.Remote;
import javax.naming.NoPermissionException;
import java.util.List;

@Remote
public interface CustomerService{
    List<CustomerDTO> findCustomersByName(String name) throws NoPermissionException;
}
