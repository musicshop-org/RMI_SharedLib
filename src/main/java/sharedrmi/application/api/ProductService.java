package sharedrmi.application.api;

import sharedrmi.application.dto.AlbumDTO;
import sharedrmi.application.dto.ArtistDTO;
import sharedrmi.application.dto.SongDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ProductService {

    List<AlbumDTO> findAlbumsBySongTitle(String title);

    List<SongDTO> findSongsByTitle(String title);

    List<ArtistDTO> findArtistsByName(String name);

}
