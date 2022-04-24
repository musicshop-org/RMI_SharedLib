package sharedrmi.application.api;

import sharedrmi.application.dto.InvoiceDTO;
import sharedrmi.application.dto.InvoiceLineItemDTO;
import sharedrmi.application.exceptions.AlbumNotFoundException;
import sharedrmi.application.exceptions.InvoiceNotFoundException;
import sharedrmi.application.exceptions.NotEnoughStockException;
import sharedrmi.domain.valueobjects.InvoiceId;

import javax.naming.NoPermissionException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InvoiceService extends Remote {

    InvoiceDTO findInvoiceById(InvoiceId invoiceId) throws RemoteException, NoPermissionException, InvoiceNotFoundException;

    void createInvoice(InvoiceDTO invoiceDTO) throws RemoteException, NoPermissionException, NotEnoughStockException, AlbumNotFoundException;

    void returnInvoiceLineItem(InvoiceId invoiceId, InvoiceLineItemDTO invoiceLineItemDTO, int returnQuantity) throws RemoteException, NoPermissionException, InvoiceNotFoundException;

}