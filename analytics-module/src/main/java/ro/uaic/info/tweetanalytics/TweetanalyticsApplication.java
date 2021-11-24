package ro.uaic.info.tweetanalytics;

import org.elasticsearch.common.collect.List;
import org.modelmapper.ModelMapper;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ro.uaic.info.tweetanalytics.models.Feedback;
import ro.uaic.info.tweetanalytics.models.Tweet;
import ro.uaic.info.tweetanalytics.repositories.FeedbackRepository;
import ro.uaic.info.tweetanalytics.repositories.TweetsRepository;

@SpringBootApplication
public class TweetanalyticsApplication {

	public static void main(String[] args) {

		SpringApplication.run(TweetanalyticsApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	ApplicationRunner applicationRunner(TweetsRepository tweetsRepository, FeedbackRepository feedbackRepository){
		return args -> {
			
			Feedback feedback1 = new Feedback("fire", 0);
			Feedback feedback2 = new Feedback("flood", 0);
			Feedback feedback3 = new Feedback("dunno", 0);
			Feedback feedback4 = new Feedback("fire", 0);
			feedbackRepository.save(feedback1);
			feedbackRepository.save(feedback2);
			feedbackRepository.save(feedback3);
			feedbackRepository.save(feedback4);
			Tweet tweet =  new Tweet("Alerta");
			tweet.setFeedbackList(List.of(feedback1, feedback2, feedback3, feedback4));
			tweetsRepository.save(tweet);


//			User user = new User();
//			user.setPassword("123");
//			user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
//			user.setUsername("Ramona");
//			usersRepository.save(user);

		};
	}

}
