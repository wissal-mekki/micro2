FROM openjdk:8-jdk


# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8082

# The application's jar file

# Add the application's jar to the container
COPY target/micro2-0.0.1-SNAPSHOT.jar micro2.jar

ENV DOCKERIZE_VERSION v0.6.0
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && rm dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz

CMD dockerize -wait tcp://docker-mysql2:3306 -timeout 60m yarn start

# Run the jar file
ENTRYPOINT [ "java" , "-Djava.security.egd=file:/dev/./urandom","-jar","/micro2.jar" ]
