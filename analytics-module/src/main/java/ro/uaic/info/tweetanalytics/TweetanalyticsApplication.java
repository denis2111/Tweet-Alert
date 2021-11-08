package ro.uaic.info.tweetanalytics;

import org.modelmapper.ModelMapper;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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
			Feedback feedback = new Feedback("BRAVO");

			feedbackRepository.save(feedback);
			Tweet tweet =  new Tweet("Alerta");
			tweetsRepository.save(tweet);

			feedbackRepository.save(new Feedback("fire", tweet));
			feedbackRepository.save(new Feedback("flood", tweet));
			feedbackRepository.save(new Feedback("dunno", tweet));
			feedbackRepository.save(new Feedback("fire", tweet));
			feedbackRepository.save(new Feedback("??", tweet));

//			User user = new User();
//			user.setPassword("123");
//			user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
//			user.setUsername("Ramona");
//			usersRepository.save(user);

		};
	}

}
