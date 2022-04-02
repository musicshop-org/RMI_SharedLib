package sharedrmi.application.api;

import sharedrmi.application.dto.InvoiceDTO;
import sharedrmi.domain.valueobjects.InvoiceId;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface InvoiceService extends Remote {

    List<InvoiceDTO> findInvoiceById(InvoiceId invoiceId) throws RemoteException;

    void createInvoice(InvoiceDTO invoiceDTO) throws RemoteException;

}
