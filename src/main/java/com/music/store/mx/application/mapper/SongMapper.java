package com.music.store.mx.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.model.Song;

@Mapper(componentModel = "spring", uses= {AlbumMapper.class})
public interface SongMapper {
 
  @Mappings({
    @Mapping(source = "songId", target="song_Id"),
    @Mapping(source = "idAlbum", target="albumId"),
    @Mapping(source = "title", target="title"),
    @Mapping(source = "author", target="author"),
    @Mapping(source = "length", target="length"),
    @Mapping(source = "album", target="album")
    
  })
  SongDto toSongDto(Song song);
}
