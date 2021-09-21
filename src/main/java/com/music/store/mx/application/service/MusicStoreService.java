/* 
* This program is free software: you can redistribute it and/or modify  
* it under the terms of the GNU General Public License as published by  
* the Free Software Foundation, version 3.
*
* This program is distributed in the hope that it will be useful, but 
* WITHOUT ANY WARRANTY; without even the implied warranty of 
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
* General Public License for more details.
*
* Nombre de archivo: MusicStoreService.java
* Autor: tflores
* Fecha de creación: 21 sep. 2021
*/
package com.music.store.mx.application.service;

import java.util.List;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;

/**
 * The Interface MusicStoreService.
 */
public interface MusicStoreService {

  /**
   * Retrieve albums.
   *
   * @return the list
   */
  List<AlbumDto> retrieveAlbums();

  /**
   * Retrieve songs.
   *
   * @return the list
   */
  List<SongDto> retrieveSongs();

  /**
   * Retrieve songs.
   *
   * @param albumId the album id
   * @return the list
   */
  List<SongDto> retrieveSongs(Long albumId);
}
