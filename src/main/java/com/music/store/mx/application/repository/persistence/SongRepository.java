package com.music.store.mx.application.repository.persistence;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.application.mapper.SongMapper;
import com.music.store.mx.application.repository.SongCrudRepository;
import com.music.store.mx.application.repository.SongsRepository;
import com.music.store.mx.model.Song;

@Repository
public class SongRepository implements SongsRepository  {
  
  @Autowired
  private SongCrudRepository songCrudRepository;
  @Autowired
  private SongMapper mapper;
  
  public List<SongDto> getAll(){
    List<Song> song = songCrudRepository.findAll();
    return mapper.toSongDtos(song) ;
  }
  
  public Optional<List<SongDto>> getByAlbum(Long idAlbum){
    List<Song> song= songCrudRepository.findByIdAlbum(idAlbum) ;
    return Optional.of(mapper.toSongDtos(song)) ;
  }
  
  @Override
  public Optional<SongDto> getSong(Long songId) {
    return songCrudRepository.findById(songId).map(song -> mapper.toSongDto(song));
    
  }
  
  @Override
  public SongDto save(SongDto songDto) {
    Song song = mapper.toSong(songDto);
    return mapper.toSongDto(songCrudRepository.save(song));
  }
  
  @Override
  public void delete(Long songId) {
    songCrudRepository.deleteById(songId);
    
  }
  
  public Long getCountRegister() {
    return songCrudRepository.count();
  }

 





  
 

}
