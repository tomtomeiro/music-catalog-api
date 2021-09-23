package com.music.store.mx.application.mapper;


import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.model.Album;

@Mapper(componentModel = "spring")
public interface AlbumMapper {
  
 
  
  @Mappings({
    @Mapping(source = "id_Album", target="id_Album"),
    @Mapping(source = "title", target="title"),
    @Mapping(source = "launching", target="launching"),
    @Mapping(source = "recordCompany", target="recordCompany"),
    @Mapping(source = "singer", target="singer"),
    @Mapping(source = "gender", target="gender"),
    
    
  })
  AlbumDto toAlbumDto(Album album);
  
  List<AlbumDto> toAlbumDtos(List<Album> album);
  
  @InheritInverseConfiguration
  @Mapping(target="song", ignore= true)
  Album toAlbum(AlbumDto albumDto);

}
