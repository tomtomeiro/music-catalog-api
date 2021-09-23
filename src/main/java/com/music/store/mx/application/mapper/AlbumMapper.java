package com.music.store.mx.application.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.model.Album;

@Mapper(componentModel = "spring")
public interface AlbumMapper {
  
 
  
  @Mappings({
    @Mapping(source = "id_Album", target="idAlbum"),
    @Mapping(source = "title", target="title"),
    @Mapping(source = "recordCompany", target="recordCompany"),
    @Mapping(source = "singer", target="singer"),
    @Mapping(source = "gender", target="gender")
    
    
  })
  AlbumDto toAlbumDto(Album album);

}
