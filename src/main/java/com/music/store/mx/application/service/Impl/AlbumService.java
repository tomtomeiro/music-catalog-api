package com.music.store.mx.application.service.Impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.application.repository.AlbumsRepository;

public class AlbumService implements AlbumsRepository {
  
  
  @Autowired
  private AlbumsRepository albumsRepository;
  @Override
  public List<AlbumDto> getAll() {
    return albumsRepository.getAll();
  }

  @Override
  public AlbumDto findByAuthor(String author) {
    return albumsRepository.findByAuthor(author);
  }

  @Override
  public Optional<AlbumDto> getByIdAlbum(Long album) {
    return albumsRepository.getByIdAlbum(album);
  }

  @Override
  public void delete(Long albumId) {
    albumsRepository.delete(albumId);
    
  }

  @Override
  public AlbumDto save(AlbumDto album) {
    return albumsRepository.save(album);
  }

}
