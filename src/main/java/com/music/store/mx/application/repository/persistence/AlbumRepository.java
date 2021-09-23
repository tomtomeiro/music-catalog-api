package com.music.store.mx.application.repository.persistence;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.application.mapper.AlbumMapper;
import com.music.store.mx.application.repository.AlbumCrudRepository;
import com.music.store.mx.application.repository.AlbumsRepository;
import com.music.store.mx.model.Album;
import com.music.store.mx.model.Song;

@Repository
public abstract class AlbumRepository implements AlbumsRepository {
  
  private AlbumCrudRepository albumCrudRepository;
  
  private AlbumMapper mapper;

  @Override
  public List<AlbumDto> getAll() {
    List<Album> album = albumCrudRepository.findAll();
    return mapper.toAlbumDtos(album);
  }

  @Override
  public Optional<AlbumDto> getByIdAlbum(Long albumId) {
    return albumCrudRepository.findById(albumId).map(album -> mapper.toAlbumDto(album));
  }

  @Override
  public AlbumDto save(AlbumDto albumDto) {
    Album album = mapper.toAlbum(albumDto); 
    return mapper.toAlbumDto(albumCrudRepository.save(album));
  }

  @Override
  public void delete(Long albumId) {
    albumCrudRepository.deleteById(albumId);
  }
  

  
}
