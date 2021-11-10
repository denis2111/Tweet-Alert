package ro.uaic.info.tweetanalytics.business;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.uaic.info.tweetanalytics.models.Tweet;
import ro.uaic.info.tweetanalytics.repositories.TweetsRepository;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TweetsService {

    private TweetsRepository repository;
    private Logger logger = LoggerFactory.getLogger(TweetsService.class);


    @Autowired
    public TweetsService (TweetsRepository tweetsRepository){
        this.repository = tweetsRepository;
    }

    public List<Tweet> getAllTweets() {
        Iterator<Tweet> iterator = repository.findAll().iterator();
        List<Tweet> tweets = new ArrayList<>();
        while (iterator.hasNext()) {
            tweets.add(iterator.next());
        }
        if (tweets.size() > 0) {
            logger.info("All tweets were returned from repository");
            return tweets;
        } else {
            logger.info("No tweets were found in the repository");
            return new ArrayList<>();
        }
    }

    public Tweet createTweet(Tweet tweet) {
//        subject.setId((int) (repository.count() + 5));
        tweet = repository.save(tweet);
        logger.info("A tweet was created in the repository");
        return tweet;
    }

    public Tweet updateById(Tweet tweet) {
        logger.info("Tweet " + tweet.getId() + " was updated in the repository");
        return repository.save(tweet);
    }

    public Tweet deleteById(int id) {
        if (repository.findById(id).isPresent()) {
            Tweet tweet = repository.findById(id).get();
            repository.deleteById(id);
            logger.info("Tweet " + id + " was deleted from repository");
            return tweet;
        }
        logger.info("The tweet to delete was not found");
        return null;
    }

    public Tweet getTweetById(int id) {
        if (repository.findById(id).isPresent()){
            logger.info("The tweet with the id " +  id + " was returned from repository");
            return repository.findById(id).get();
        }
        logger.info("The tweet with the id " +  id + " was not found in the repository");
        return null;
    }
}
