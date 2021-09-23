package com.music.store.mx.application.repository;

import java.util.List;
import java.util.Optional;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.model.Song;

public interface SongRepository {

  List<SongDto> findAll(); 

  List<SongDto> findByAuthor(String author);
  
  Optional<SongDto> getSong(Long songId);
  
  SongDto save(SongDto song);
  
  void delete(Long songId);
}
