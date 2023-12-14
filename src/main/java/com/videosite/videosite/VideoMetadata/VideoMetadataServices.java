package com.videosite.videosite.VideoMetadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoMetadataServices {

    @Autowired
    VideoMetadataRepository videoMetadataRepository;

    public List<VideoMetadata> getTop10Videos() {
        return videoMetadataRepository.findTop10ByOrderByCreatedAtDesc();
    }

    public VideoMetadata createVideoMetadata(VideoMetadata videoMetadata) {
        return videoMetadataRepository.save(videoMetadata);
    }
    
}
