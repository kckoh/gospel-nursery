package com.example.backend.service;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.example.backend.dto.ImageUrl;
import com.example.backend.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ImageService {

    private final ImageRepository imageRepository;

    public List<ImageUrl> getImages() {
        return imageRepository.getImages();

//        List<ImageUrl> images = new ArrayList<>(20);
//        String bucketName = "gospel-buck";
//        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_1).build();
//        ListObjectsV2Result result = s3.listObjectsV2(bucketName);
//        List<S3ObjectSummary> objects = result.getObjectSummaries();
//        for (S3ObjectSummary os : objects) {
//            System.out.println("* " + os.getKey());
//        }
//        return images;
    }
}
