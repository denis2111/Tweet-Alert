# Tweet-Alert

<h3>Members names:</h3> 
<ul>
  <li> Albert Ramona </li>
  <li> Avram Andrei </li>
  <li> Banu Denis </li>
  <li> Lungu Alexandru </li>
</ul>

<h3>Coordinator:</h3> 
<ul>
	<li> Conf. dr. Breaban Mihaela </li>
</ul>

<h3>Contact information:</h3>
<ul>
	<li> albert.ramona99@gmail.com </li>
	<li> avram1andrei@gmail.com </li>
	<li> banudenis99@gmail.com </li>
	<li> lungualex00@gmail.com </li>
</ul>
	

<p>State of the art: https://www.overleaf.com/4454644824bsgrwfszghgv</p>
<p>Trello: https://trello.com/disastertweets</p>
<p>Requirements: https://docs.google.com/document/d/1tj6PDt6hevJm8uTronpwe4ivntxwhMtlO2do5pjflMA/edit?usp=sharing</p>
<p>Diagrams: https://drive.google.com/file/d/1-4F9pizBoWPs-wXO9OFiDQNYVWm3oe1X/view?usp=sharing</p>

Design Patterns:
* [Builder](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/models/ResponseBuilder.java) for response (Creational) (Denis + Alex)
* Template for [ClassifierClient](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/ClassifierClient.java) (Behavioral) (Denis + Alex)
* Decorator for [LocalizedReponse](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/models/LocalizedResponse.java) (Structural) (Denis + Alex)
* Singleton for [AnalyticsClient](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/AnalyticsClient.java), [NLPClassifierClient](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/NLPClassifierClient.java), [ImageClassifierClient](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/ImageClassifierClient.java) (Creational) (Denis + Alex)
* Iterator for tokens (Behavioral) (Andrei)
* State (Behavioral) (Andrei)
* Facade for [Repository from Analytics](https://github.com/denis2111/Tweet-Alert/blob/main/analytics-module/src/main/java/ro/uaic/info/analytics/repositories/JpaRepository.java#L17) (Structural) (Ramona)
* Chain of [Responsibility for Analytics](https://github.com/denis2111/Tweet-Alert/blob/main/analytics-module/src/main/java/ro/uaic/info/analytics/exceptions/ControllerAdvice.java) (Behavioral) -  an n-layered architecture for Analytics Module (Ramona)

EMF:
* Ramona, Alex - Analytics EMF diagram -  generated code on github
* Andrei, Denis - WebController EMF diagram -  generated code on github
