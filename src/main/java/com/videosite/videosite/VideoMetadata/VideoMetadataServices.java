package com.videosite.videosite.VideoMetadata;

import java.util.List;

public class VideoMetadataServices {

    VideoMetadataRepository videoMetadataRepository;

    public List<VideoMetadata> getTop10Videos() {
        return videoMetadataRepository.findTop10ByOrderByCreatedAtDesc();
    }

    public VideoMetadata createVideoMetadata(VideoMetadata videoMetadata) {
        return videoMetadataRepository.save(videoMetadata);
    }
    
}
