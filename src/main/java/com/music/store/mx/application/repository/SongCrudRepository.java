package com.music.store.mx.application.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.music.store.mx.model.Song;

public interface SongCrudRepository extends JpaRepository<Song, Long> {
  List<Song> findByIdAlbum(Long idAlbum);
}
