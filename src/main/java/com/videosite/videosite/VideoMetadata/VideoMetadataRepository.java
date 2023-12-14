package com.videosite.videosite.VideoMetadata;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoMetadataRepository extends JpaRepository<VideoMetadata, Long> {
    
        List<VideoMetadata> findTop10ByOrderByCreatedAtDesc();

}
