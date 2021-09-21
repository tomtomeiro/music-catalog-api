package com.music.store.mx.application.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.application.service.MusicStoreService;

@RestController
@RequestMapping("/api")
public class MusicStoreController {
  @Autowired
  private MusicStoreService musicStoreService;

  public MusicStoreController(MusicStoreService musicStoreService) {
    this.musicStoreService=  musicStoreService;
  }
  
 
    @GetMapping("/saludar")
    public String saludar() {
      return "Hola mundo";
    }
  
  
  @GetMapping(value = "/api/v1/albums", produces = "application/json")
  public ResponseEntity<List<AlbumDto>> getAlbums(){
    return new ResponseEntity<>(musicStoreService.retrieveAlbums(), HttpStatus.OK);
  }
  @GetMapping(value="api/v1/songs", produces="application/json")
  public ResponseEntity<List<SongDto>> getSongs(){
    return new ResponseEntity<>(musicStoreService.retrieveSongs(), HttpStatus.OK);
  }
  

}
