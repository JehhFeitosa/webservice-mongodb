package com.jessicafeitosa.webservicesmongodb.repository;

import com.jessicafeitosa.webservicesmongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
