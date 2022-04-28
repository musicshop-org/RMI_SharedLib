package sharedrmi.application.api;

import sharedrmi.application.dto.AlbumDTO;
import sharedrmi.application.dto.ArtistDTO;
import sharedrmi.application.dto.SongDTO;
import sharedrmi.application.exceptions.AlbumNotFoundException;
import sharedrmi.application.exceptions.NotEnoughStockException;
import sharedrmi.domain.enums.MediumType;

import javax.ejb.Remote;
import javax.naming.NoPermissionException;

import java.util.List;

@Remote
public interface ProductService {

    List<AlbumDTO> findAlbumsBySongTitle(String title);

    AlbumDTO findAlbumByAlbumTitleAndMedium(String title, MediumType mediumType) throws AlbumNotFoundException;

    List<SongDTO> findSongsByTitle(String title);

    List<ArtistDTO> findArtistsByName(String name);

    void decreaseStockOfAlbum(String title, MediumType mediumType, int decreaseAmount) throws NoPermissionException, NotEnoughStockException;

    void increaseStockOfAlbum(String title, MediumType mediumType, int decreaseAmount) throws NoPermissionException;

}
