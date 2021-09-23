package com.music.store.mx.application.repository;

import java.util.List;
import java.util.Optional;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.model.Song;

public interface SongsRepository {
  
  List<SongDto> getAll();
  
  Optional<List<SongDto>> getByAlbum(Long idAlbum);

  Optional<SongDto> getSong(Long songId);
  
  SongDto save(SongDto song);
  
  void delete(Long songId);

 
}
