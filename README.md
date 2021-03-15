# orderService

* This service exposes order functionality.
* This service is used by cart-service to checkout shopping cart
* This service cannot be accessed by outside world.
* Only the microserices having microservice scope can consume this service
* GRANT_TYPE - client_credentials is using for securing this service

## Endpoints
1. http://http://localhost:9000/order-service/placeOrder POST
