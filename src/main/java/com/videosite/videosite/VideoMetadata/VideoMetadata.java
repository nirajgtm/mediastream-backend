package com.videosite.videosite.VideoMetadata;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.Date;

@Entity
@Data
@Table(name = "videoMetadata")
public class VideoMetadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String thumbnailUrl;
    private String title;
    private Integer videoLength;
    private String link;
    private String genre;
    private String description;
    private Date createdAt;
    private Date updatedAt;

}