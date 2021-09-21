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
* Nombre de archivo: SongsRepository.java
* Autor: tflores
* Fecha de creación: 21 sep. 2021
*/
package com.music.store.mx.application.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.music.store.mx.model.Song;

/**
 * The Interface SongsRepository.
 */
public interface SongsRepository extends JpaRepository<Song, Long> {
  
  /**
   * Find all.
   *
   * @return the list
   */
  List<Song> findAll();

  /**
   * Find by author.
   *
   * @param author the author
   * @return the list
   */
  List<Song> findByAuthor(String author);

}
