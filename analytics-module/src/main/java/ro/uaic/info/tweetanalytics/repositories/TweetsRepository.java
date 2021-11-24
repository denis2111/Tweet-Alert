package ro.uaic.info.tweetanalytics.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import ro.uaic.info.tweetanalytics.models.Tweet;

import java.util.Optional;

@Repository
public interface TweetsRepository extends ElasticsearchRepository<Tweet, Integer> {

    Optional<Object> findByHash(String hash);
}
