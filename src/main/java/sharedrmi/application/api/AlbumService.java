package sharedrmi.application.api;

import sharedrmi.application.dto.AlbumDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface AlbumService extends Remote {

    List<AlbumDTO> findAlbumsByTitle(String title) throws RemoteException;

}
