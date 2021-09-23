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
* Nombre de archivo: Song.java
* Autor: tflores
* Fecha de creación: 21 sep. 2021
*/
package com.music.store.mx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/**
 * Sets the length.
 *
 * @param length the new length
 */
@Setter

/**
 * Gets the length.
 *
 * @return the length
 */
@Getter
@Entity
@Table(name = "Cancion")
public class Song {

  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idCancion", nullable = false, length = 11)
  private Long songId;
  
  @Column(name="id_Album", nullable = false)
  private Long idAlbum;

  
  @Column(name = "titulo", nullable = false, length = 45)
  private String title;

  
  
  @Column(name = "autor", nullable = true, length = 45)
  private String author;

  
  @Column(name = "duracion", nullable = false)
  private Float length;
  
  @ManyToOne
  @JoinColumn(name = "id_Album", nullable = false, updatable= false, insertable = false)
  private Album album;


}
