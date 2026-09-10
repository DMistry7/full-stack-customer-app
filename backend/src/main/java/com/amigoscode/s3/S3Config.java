package com.amigoscode.s3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
public class S3Config {

    @Value("${aws.region}")
    private String awsRegion;
    // takes from resources

    @Value("${aws.s3.mock}")
    private boolean mock;
    // takes mock from application.yml

    @Bean
    public S3Client s3Client() {
        if (mock) {
            return new FakeS3();
        }
        S3Client client = S3Client.builder()
                .region(Region.of(awsRegion))
                .build();
        return client;
    }
}
