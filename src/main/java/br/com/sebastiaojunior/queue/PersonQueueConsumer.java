package br.com.sebastiaojunior.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

import br.com.sebastiaojunior.model.Person;

@Component
public class PersonQueueConsumer {
	
	private static final Logger LOG = LoggerFactory.getLogger(PersonQueueConsumer.class);
	
	@SqsListener(value = "${app.queue-name}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
	public void listen(Person person) {
		LOG.info("Received message= {}", person.toString());
	}
}
