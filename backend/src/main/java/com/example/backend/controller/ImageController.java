package com.example.backend.controller;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.example.backend.dto.ImageUrl;
import com.example.backend.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RequestMapping(value = "/upload")
@RequiredArgsConstructor
@RestController
public class ImageController {

    private final ImageService imageService;

    @GetMapping
    public List<ImageUrl> getImages() {
        return imageService.getImages();

    }
}
