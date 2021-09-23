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
* Nombre de archivo: Album.java
* Autor: tflores
* Fecha de creación: 21 sep. 2021
*/
package com.music.store.mx.model;

import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 * Gets the coverage.
 *
 * @return the coverage
 */
@Getter


@Setter
public class Album {
  
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idAlbum", nullable = false, length = 11)
  private Long id_Album;
  
  @OneToMany(mappedBy = "album")
  private List<Song> song;
  
 
  @Column(name = "titulo", nullable = false, length = 45)
  private String title;
  
 
  @Column(name = "lanzamiento", nullable = false)
  private Date launching;
  
  
  @Column(name = "disquera", nullable = false, length = 45)
  private String recordCompany;
  
 
  @Column(name = "cantante", nullable = false, length = 45)
  private String singer;
  

  @Column(name = "genero", nullable = false, length = 11)
  private String gender;
  

  @Column(name = "cobertura", nullable = false, length = 250)
  private String coverage;

}
