package com.music.store.mx.application.mapper;

import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.model.Song;

@Mapper(componentModel = "spring", uses= {AlbumMapper.class})
public interface SongMapper {
 
  @Mappings({
    @Mapping(source = "songId", target="songId"),
    @Mapping(source = "idAlbum", target="idAlbum"),
    @Mapping(source = "title", target="title"),
    @Mapping(source = "author", target="author"),
    @Mapping(source = "length", target="length"),
    @Mapping(source = "album", target="album")
    
    
    
  })
  SongDto toSongDto(Song song);
  
  List<SongDto> toSongDtos(List<Song> song);
  
  @InheritInverseConfiguration 
  Song toSong(SongDto songDto);
}
