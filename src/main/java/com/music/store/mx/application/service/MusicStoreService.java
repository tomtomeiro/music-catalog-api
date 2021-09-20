package com.music.store.mx.application.service;

import java.util.List;
import com.music.store.mx.application.dto.AlbumDto;

public interface MusicStoreService {

  List<AlbumDto> retrieveAlbums();
}
