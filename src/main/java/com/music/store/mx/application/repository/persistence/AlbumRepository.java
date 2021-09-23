package com.music.store.mx.application.repository.persistence;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.music.store.mx.application.repository.AlbumCrudRepository;
import com.music.store.mx.model.Album;
import com.music.store.mx.model.Song;

@Repository
public class AlbumRepository {
  private AlbumCrudRepository albumCrudRepository;
  
  public List<Album> getAll(){
    return albumCrudRepository.findAll();
  }
  
  public Optional<Album> getAlbum(Long idSong){
    return albumCrudRepository.findById(idSong); 
  }
  
  public Album save(Album idAlbum) {
    return albumCrudRepository.save(idAlbum);
  }
  
  public void deletebyId(Long idSong) {
    albumCrudRepository.deleteById(idSong);
  }
  
  public Long getCountRegister() {
    return albumCrudRepository.count();
  }
  
}
