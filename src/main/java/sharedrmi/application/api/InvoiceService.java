package sharedrmi.application.api;

import sharedrmi.application.dto.InvoiceDTO;
import sharedrmi.application.dto.InvoiceLineItemDTO;
import sharedrmi.domain.valueobjects.InvoiceId;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InvoiceService extends Remote {

    InvoiceDTO findInvoiceById(InvoiceId invoiceId) throws RemoteException, Exception;
    void createInvoice(InvoiceDTO invoiceDTO) throws RemoteException;
    void returnInvoiceLineItem(InvoiceId invoiceId, InvoiceLineItemDTO invoiceLineItemDTO, int returnQuantity);
}
