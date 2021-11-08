package ro.uaic.info.tweetanalytics.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.uaic.info.tweetanalytics.models.Feedback;
import ro.uaic.info.tweetanalytics.models.Tweet;
import ro.uaic.info.tweetanalytics.repositories.FeedbackRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class FeedbackService {
    private FeedbackRepository repository;
    private Logger logger = LoggerFactory.getLogger(FeedbackService.class);

    @Autowired
    public FeedbackService (FeedbackRepository feedbackRepository){
        this.repository = feedbackRepository;
    }

    public List<Feedback> getAllFeedback() {
        Iterator<Feedback> iterator = repository.findAll().iterator();
        List<Feedback> feedbackList = new ArrayList<>();
        while (iterator.hasNext()) {
            feedbackList.add(iterator.next());
        }
        if (feedbackList.size() > 0) {
            logger.info("All feedback were returned from repository");
            return feedbackList;
        } else {
            logger.info("No feedback were found in the repository");
            return new ArrayList<>();
        }
    }

    public Feedback createFeedback (Feedback feedback){
        feedback.setId((int) (repository.count()+1));
        feedback = repository.save(feedback);
        logger.info("Feedback was created in the repository");
        return feedback;
    }


    public void updateById(Feedback feedback) {
        repository.save(feedback);
        logger.info("Feedback " + feedback.getId() + " was updated in the repository");
    }

    public Feedback deleteById(int id) {
        if (repository.findById(id).isPresent()) {
            Feedback feedback = repository.findById(id).get();
            repository.deleteById(id);
            logger.info("Feedbacl " + id + " was deleted from repository");
            return feedback;
        }
        logger.info("The question to delete was not found");
        return null;
    }

    public Feedback getFeedbackById(int id) {
        if (repository.findById(id).isPresent()){
            logger.info("Feedback with the id " +  id + " was returned from repository");
            return repository.findById(id).get();
        }
        logger.info("Feedback with the id " +  id + " was not found in the repository");
        return null;
    }
}
