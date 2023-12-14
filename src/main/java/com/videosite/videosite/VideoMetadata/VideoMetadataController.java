package com.videosite.videosite.VideoMetadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videoMetadata")

public class VideoMetadataController {

    @Autowired
    VideoMetadataServices videoMetadataServices;

    @GetMapping("/top10")
    public ResponseEntity<List<VideoMetadata>> getVideoMetadatas() {
        try {
            return ResponseEntity.ok().body(videoMetadataServices.getTop10Videos());
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/create")
    public ResponseEntity<String> createVideoMetadata(@RequestBody VideoMetadata videoMetadata) {
        try {
            VideoMetadata createdVideoMetadata = videoMetadataServices.createVideoMetadata(videoMetadata);
            return ResponseEntity.ok().body("Video metadata created with ID: " + createdVideoMetadata.getId());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error creating video metadata: " + e.getMessage());
        }
    }
    
}
