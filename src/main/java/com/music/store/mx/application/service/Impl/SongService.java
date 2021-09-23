package com.music.store.mx.application.service.Impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.application.repository.SongsRepository;

public class SongService implements SongsRepository {
  
  @Autowired
  private SongsRepository songsRepository;
  

  @Override
  public List<SongDto> getAll() {
    return songsRepository.getAll();
  }

  @Override
  public Optional<List<SongDto>> getByAlbum(Long idAlbum) {
    return songsRepository.getByAlbum(idAlbum);
  }

  @Override
  public Optional<SongDto> getSong(Long songId) {
    return songsRepository.getSong(songId);
  }

  @Override
  public SongDto save(SongDto song) {
    return songsRepository.save(song);
  }

  @Override
  public boolean delete(Long songId) {
    return getSong(songId).map(song->{
      songsRepository.delete(songId);
      return true;
    }).orElse(false);
    
    
  }

}
