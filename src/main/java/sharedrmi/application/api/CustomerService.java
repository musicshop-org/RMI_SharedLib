package sharedrmi.application.api;

import sharedrmi.application.dto.CustomerDTO;

import javax.ejb.Remote;
import javax.naming.NoPermissionException;
import java.io.Serializable;
import java.util.List;

@Remote
public interface CustomerService extends Serializable {
    List<CustomerDTO> findCustomersByName(String name) throws NoPermissionException;
}
