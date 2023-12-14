package com.videosite.videosite.VideoMetadata;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "videoMetadata")
public class VideoMetadata {

    @Id
    private Long id;
    private String thumbnailUrl;
    private String title;
    private Integer videoLength;
    private String link;
    private String genre;

    public VideoMetadata() {
    }

    public VideoMetadata(Long id, String thumbnailUrl, String title, Integer videoLength, String link, String genre) {
        this.id = id;
        this.thumbnailUrl = thumbnailUrl;
        this.title = title;
        this.videoLength = videoLength;
        this.link = link;
        this.genre = genre;
    }

    // getters and setters
}