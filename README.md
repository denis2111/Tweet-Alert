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

<b>Design Patterns</b>:
* <b>[Builder](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/models/ResponseBuilder.java)</b>(Creational) for response (Denis + Alex)
* <b>Template</b>(Behavioral) for [ClassifierClient](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/ClassifierClient.java) (Denis + Alex)
* <b>Decorator</b>(Structural) for [LocalizedReponse](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/models/LocalizedResponse.java) (Denis + Alex)
* <b>Singleton</b>(Creational) for [AnalyticsClient](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/AnalyticsClient.java), [NLPClassifierClient](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/NLPClassifierClient.java), [ImageClassifierClient](https://github.com/denis2111/Tweet-Alert/blob/main/web-controller/src/main/java/ro/uaic/info/tweetalert/ImageClassifierClient.java) (Denis + Alex)
* <b>Iterator</b>(Behavioral) for [TokensCollection](https://github.com/denis2111/Tweet-Alert/blob/main/nlp-module/tokenizer_component/tokens_collection.py) in NLP module (Andrei)
* <b>State</b>(Behavioral) for [Tokenizer](https://github.com/denis2111/Tweet-Alert/blob/main/nlp-module/tokenizer_component/tokenizer.py) in NLP module (Andrei)
* <b>Facade</b>(Structural) for [Repository from Analytics](https://github.com/denis2111/Tweet-Alert/blob/main/analytics-module/src/main/java/ro/uaic/info/analytics/repositories/JpaRepository.java#L17) (Ramona)
* <b>Chain of Responsibility</b>(Behavioral)  for [Analytics](https://github.com/denis2111/Tweet-Alert/blob/main/analytics-module/src/main/java/ro/uaic/info/analytics/exceptions/ControllerAdvice.java) - an n-layered architecture for Analytics Module (Ramona)

<b>EMF</b>:
* Ramona, Alex - Analytics EMF diagram -  generated code on github
* Andrei, Denis - WebController EMF diagram -  generated code on github

<b>MDD/TDD iterations</b>
 * Ramona, Alex - Analytics 2 more detailed diagrams for 2 MDD iterations. Code generated on github + implemented some functionalities
 * Andrei, Denis - WebController 2 TDD iterations 

<b>BPMN</b>
 * Ramona, Alex -based on feedback process
 * Andrei, Denis - based on NLP module
