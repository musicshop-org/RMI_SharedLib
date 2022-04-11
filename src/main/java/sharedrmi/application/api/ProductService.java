package sharedrmi.application.api;

import sharedrmi.application.dto.AlbumDTO;
import sharedrmi.application.dto.ArtistDTO;
import sharedrmi.application.dto.SongDTO;
import sharedrmi.domain.enums.MediumType;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ProductService extends Remote{

    List<AlbumDTO> findAlbumsBySongTitle(String title) throws RemoteException;

    AlbumDTO findAlbumByAlbumTitleAndMedium(String title, MediumType mediumType) throws RemoteException;

    List<SongDTO> findSongsByTitle(String title) throws RemoteException;

    List<ArtistDTO> findArtistsByName(String name) throws RemoteException;

}
