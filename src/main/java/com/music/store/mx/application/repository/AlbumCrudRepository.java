package com.music.store.mx.application.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.model.Album;

public interface AlbumCrudRepository extends JpaRepository<Album, Long> {
  List<Album> findAll();
  
 
  
  Optional<Album> getByAuthor(String author);
  
  Album save(AlbumDto album);
  
  void deletebyId(Long idSong);
  
  Long getCountRegister();
}
