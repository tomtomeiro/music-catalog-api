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
* Nombre de archivo: MusicStoreServiceImpl.java
* Autor: tflores
* Fecha de creación: 21 sep. 2021
*/
package com.music.store.mx.application.service.Impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.application.mapper.SongMapper;
import com.music.store.mx.application.mapper.AlbumMapper;
import com.music.store.mx.application.repository.AlbumRepository;
import com.music.store.mx.application.repository.SongRepository;
import com.music.store.mx.application.service.MusicStoreService;


/**
 * The Class MusicStoreServiceImpl.
 */
@Service
public class MusicStoreServiceImpl implements MusicStoreService {

  /** The album repository. */
  private AlbumRepository albumRepository;

  /** The songs repository. */
  private SongRepository songsRepository;

  /**
   * Instantiates a new music store service impl.
   *
   * @param albumRepository the album repository
   * @param songsRepository the songs repository
   */
  public MusicStoreServiceImpl(AlbumRepository albumRepository, SongRepository songsRepository) {
    this.albumRepository = albumRepository;
    this.songsRepository = songsRepository;
  }

  /**
   * Retrieve albums.
   *
   * @return the list
   */
  /*@Override
  public List<AlbumDto> retrieveAlbums() {
    return this.albumRepository.findAll().stream().map(AlbumMapper::toDto)
        .collect(Collectors.toList());
  }*/

  /**
   * Retrieve songs.
   *
   * @return the list
   */
  /*@Override
  public List<SongDto> retrieveSongs() {
    return this.songsRepository.findAll().stream().map(SongMapper::toDto)
        .collect(Collectors.toList());

  }*/

  /**
   * Retrieve songs.
   *
   * @param albumId the album id
   * @return the list
   */
  @Override
  public List<SongDto> retrieveSongs(Long albumId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<AlbumDto> retrieveAlbums() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<SongDto> retrieveSongs() {
    // TODO Auto-generated method stub
    return null;
  }



}
