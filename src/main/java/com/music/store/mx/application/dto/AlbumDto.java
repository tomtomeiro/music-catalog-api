package com.music.store.mx.application.dto;

import java.sql.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Gets the length.
 *
 * @return the length
 */
@Getter

/**
 * Sets the length.
 *
 * @param length the new length
 */
@Setter

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
public class AlbumDto {
  
  private Long id_Album;
  
  private String title;
  
  private Date launching;
  
  private String recordCompany;
  
  private String singer;
  
  private String gender;
  
  private String coverage;
  
  
  
  
}
