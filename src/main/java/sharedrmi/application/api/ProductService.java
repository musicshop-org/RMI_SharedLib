package sharedrmi.application.api;

import sharedrmi.application.dto.AlbumDTO;
import sharedrmi.application.dto.ArtistDTO;
import sharedrmi.application.dto.SongDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ProductService extends Remote {

    List<AlbumDTO> findAlbumsByTitle(String title) throws RemoteException;

    List<SongDTO> findSongsByTitle(String title) throws RemoteException;

    List<ArtistDTO> findArtistsByName(String name) throws RemoteException;

}
