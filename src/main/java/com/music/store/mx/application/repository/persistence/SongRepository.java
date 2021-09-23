package com.music.store.mx.application.repository.persistence;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.music.store.mx.application.repository.SongCrudRepository;
import com.music.store.mx.model.Song;

@Repository
public class SongRepository {
  private SongCrudRepository songCrudRepository;
  
  public List<Song> getAll(){
    return  songCrudRepository.findAll();
  }
  
  public List<Song> getByAlbum(Long idAlbum){
    return songCrudRepository.findByIdAlbum(idAlbum);
    
  }
  
  public Optional<Song> getSong(Long idSong){
    return songCrudRepository.findById(idSong); 
  }
  
  public Song save(Song song) {
    return songCrudRepository.save(song);
  }
  
  public void deletebyId(Long idSong) {
    songCrudRepository.deleteById(idSong);
  }
  
  public Long getCountRegister() {
    return songCrudRepository.count();
  }

}
