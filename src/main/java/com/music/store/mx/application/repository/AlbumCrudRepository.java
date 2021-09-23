package com.music.store.mx.application.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.music.store.mx.model.Album;

public interface AlbumCrudRepository extends JpaRepository<Album, Long> {
  List<Album> findAll();
}
