package ro.uaic.info.tweetanalytics.controllers;

import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uaic.info.tweetanalytics.DTOs.FeedbackDTO;
import ro.uaic.info.tweetanalytics.business.TweetsService;
import ro.uaic.info.tweetanalytics.models.Feedback;
import ro.uaic.info.tweetanalytics.models.Tweet;
import ro.uaic.info.tweetanalytics.repositories.TweetsRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;

@CrossOrigin
@RestController
@RequestMapping("api/v1/tweets")
public class TweetsController {

    private final TweetsService tweetsService;
    private ModelMapper modelMapper;
    private Logger logger = LoggerFactory.getLogger(TweetsController.class);

    @Autowired
    public TweetsController(TweetsService tweetsService, ModelMapper modelMapper) {
        this.tweetsService = tweetsService;
        this.modelMapper = modelMapper;
    }

    @ApiOperation(value = "View a list of available tweets", response = List.class)
    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public List<Tweet> getSubjects() {
        List<Tweet> questions = tweetsService.getAllSubjects();
        logger.info("Get all the subjects");
        return questions;
    }

    @ApiOperation(value = "View a tweet with a specific id", response = Tweet.class)
    @GetMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Tweet getTweet(@PathVariable int id) throws NotFoundException {
        Tweet tweet = tweetsService.getTweetById(id);
        if (tweet == null) {
            logger.warn("Tweet " + id + " not found");
            throw new NotFoundException("Tweet " + id + " not found");
        }
        logger.info("Get a Tweet by id");
        return tweet;
    }

    @ApiOperation(value = "Add a tweet", response = Tweet.class)
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Tweet createTweet(@RequestBody Tweet tweet
//                                 @RequestHeader(name = "Authorization") String token
    ) {
        Tweet tweet1 = tweetsService.createTweet(tweet);
        logger.info("The tweet with the id " +  tweet1.getId() + " was created");
        return tweet1;
    }

    @ApiOperation(value = "Update a tweet", response = Tweet.class)
    @PutMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public Tweet updateSubject(@PathVariable("id") int id,
                               @RequestBody Tweet tweet
//                               @RequestHeader(name = "Authorization") String token
    ) throws NotFoundException {
        Tweet tweet1 = tweetsService.getTweetById(id);

        if (tweet1 == null) {
            logger.warn("Tweet not found");
            throw new NotFoundException("Tweet " + id + " not found");
        }
        if (tweet.getText() != null) {
            tweet1.setText(tweet.getText());
        }
        logger.info("The subject with the id " +  tweet1.getId() + " was updated");
        return tweetsService.updateById(tweet1);
    }

    @ApiOperation(value = "Delete a tweet")
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public ResponseEntity<String> deleteTweetById(@PathVariable int id
//                                                @RequestHeader(name = "Authorization") String token
    ) throws NotFoundException {
        Tweet tweet = tweetsService.deleteById(id);

        if (tweet == null) {
            logger.warn("Tweet not found");
            throw new NotFoundException("Tweet " + id + " not found");
        }
        logger.info("The tweet with the id " +  tweet.getId() + " was deleted");
        return null;
    }


//    -------------------------------------- QUESTIONS --------------------------------------------------------------------------

    @GetMapping(value = "/{id}/feedback")
    @ResponseStatus(value = HttpStatus.OK)
    public List<FeedbackDTO> getQuestions(@PathVariable int id) {
        Tweet tweet = tweetsService.getTweetById(id);
        logger.info("Get all the feedback for tweet " + id);

        List<FeedbackDTO> questionDTOS = new ArrayList<>();
        for (Feedback question : tweet.getFeedbackList()){
            questionDTOS.add(modelMapper.map(question, FeedbackDTO.class));
        }
        return questionDTOS;
    }

    @GetMapping(value = "/{id}/feedback/{id1}")
    @ResponseStatus(value = HttpStatus.OK)
    public FeedbackDTO getQuestion(@PathVariable int id, @PathVariable int id1) throws NotFoundException {
        Tweet tweet = tweetsService.getTweetById(id);
        for (Feedback feedback : tweet.getFeedbackList()){
            if (feedback.getId() == id1) {
                logger.info("Get the feedback " + id1 + "  for tweet " + id);
                return modelMapper.map(feedback, FeedbackDTO.class);
            }
        }
        logger.warn("Feedback not found" + id);
        throw new NotFoundException("Feedback not found" + id);

    }

    @PostMapping(value = "/{id}/feedback")
    @ResponseStatus(value = HttpStatus.CREATED)
    public List<Feedback> createFeedback(@PathVariable int id,
                                         @RequestBody List<FeedbackDTO> feedbackList
//                                         @RequestHeader(name = "Authorization") String token
    ) {
        final Tweet tweet = tweetsService.getTweetById(id);

        List<Feedback> feedbackList1 = new ArrayList<>();
        feedbackList.stream().forEach(x -> feedbackList1.add(modelMapper.map(x, Feedback.class)));
        feedbackList1.stream()
                .forEach(x -> x.setTweet(tweet));
        tweet.getFeedbackList().addAll(feedbackList1);
        logger.info("Create new questions for subject " + id);
        return tweetsService.updateById(tweet).getFeedbackList();
    }

    @PutMapping(value = "/{id}/feedback/{id1}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public FeedbackDTO updateFeedback(@PathVariable("id") int id,
                                      @PathVariable("id1") int id1,
                                      @RequestBody FeedbackDTO feedback
//                                      @RequestHeader(name = "Authorization") String token
    ) {
        final Tweet tweet = tweetsService.getTweetById(id);
        tweet.getFeedbackList().stream()
                .filter(x -> x.getId() == id1)
                .collect(Collectors.toList())
                .forEach(x -> {
                    x.setText(feedback.getText());
                });
        tweetsService.updateById(tweet);
        logger.info("Update feedback " + id1 + " for tweet " + id);
        return feedback;
    }

    @DeleteMapping(value = "/{id}/feedback/{id1}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteQuestion(@PathVariable("id") int id,
                                            @PathVariable("id1") int id1
//                                            @RequestHeader(name = "Authorization") String token
    ) {
        Tweet tweet = tweetsService.getTweetById(id);
        tweet.getFeedbackList().stream()
                .filter(x -> x.getId() == id1)
                .collect(Collectors.toList())
                .forEach(x -> tweet.getFeedbackList().remove(x));

        tweetsService.updateById(tweet);
        logger.info("deleted feedback " + id1 + " for tweet " + id);
        return null;
    }
}
