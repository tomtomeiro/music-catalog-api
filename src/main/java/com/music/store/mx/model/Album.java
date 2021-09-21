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
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Gets the coverage.
 *
 * @return the coverage
 */
@Getter

/**
 * Sets the coverage.
 *
 * @param coverage the new coverage
 */
@Setter
public class Album {
  
  /** The album id. */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idAlbum", nullable = false, length = 11)
  private Integer albumId;
  
  /** The title. */
  @Column(name = "titulo", nullable = false, length = 45)
  private String title;
  
  /** The launching. */
  @Column(name = "lanzamiento", nullable = false)
  private Date launching;
  
  /** The record company. */
  @Column(name = "disquera", nullable = false, length = 45)
  private String recordCompany;
  
  /** The singer. */
  @Column(name = "cantante", nullable = false, length = 45)
  private String singer;
  
  /** The gender. */
  @Column(name = "genero", nullable = false, length = 11)
  private String gender;
  
  /** The coverage. */
  @Column(name = "cobertura", nullable = false, length = 250)
  private String coverage;

}
