# Instructions
```ssh
java -jar modules/openapi-generator-cli/target/openapi-generator-cli.jar generate \
--additional-properties artifactId=product-service-java-client, groupId=de.c24.giro.client, artifactVersion=1.0.0 \
--additional-properties apiPackage=de.c24.giro.client.api, modelPackage=de.c24.giro.client.model \
-i ../docs/api-docs.yaml \
-g java \
-o ../product_api_client
```