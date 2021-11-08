package ro.uaic.info.tweetanalytics.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import ro.uaic.info.tweetanalytics.models.Feedback;
import ro.uaic.info.tweetanalytics.models.Tweet;

@Repository
public interface FeedbackRepository extends ElasticsearchRepository<Feedback, Integer> {

}
