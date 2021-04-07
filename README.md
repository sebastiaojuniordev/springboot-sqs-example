# Spring Boot SQS Example

Sending and receiving messages in Amazon SQS using Spring Boot.

## Configuration
Change the application.properties with your AWS settings.

## Run

```bash
mvn spring-boot:run
```

## Test

```python
curl --request POST \
  --url http://localhost:8080/sqs-example/send \
  --header 'Content-Type: application/json' \
  --data '{
	"id": 1,
	"fullName": "Sebastiao Junior",
	"email": "sebastiaojuniordev@gmail.com"
}'
```

## License
[MIT](https://choosealicense.com/licenses/mit/)
