package com.example.backend.repository;

import com.example.backend.dto.ImageUrl;

import java.util.List;

public interface ImageRepository {
    List<ImageUrl> getImages();
}
