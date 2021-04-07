package br.com.sebastiaojunior.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sebastiaojunior.model.Person;

@RestController
@RequestMapping(value = "/sqs-example")
public class SqsResource {

    public static final Logger LOG = LoggerFactory.getLogger(SqsResource.class);
    
    @Value("${app.queue-name}")
	private String queueName;
 
    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;
 
    @PostMapping(value = "/send")
    public ResponseEntity<String> sendMessageToSqs(@RequestBody Person person) {
        LOG.info("Sending the message to the Amazon sqs.");
        queueMessagingTemplate.convertAndSend(queueName, person);
        LOG.info("Message sent successfully to the Amazon sqs.");
        return ResponseEntity.ok("Success");
    }
}
