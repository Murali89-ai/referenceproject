FROM artifactory.wureachprod.awswuintranet.net/hub-docker-prod/hub/alpine/3.20/openjdk/17:latest as intermediate

LABEL “maintainer”="aman.jain@wu.com" \
  “name”="customer_profilelt_v2_svc" \
  "version"="11.0"  \
  "jdk.version"="17.0" \
  "alpine.version"="3.15" \
  "summary"="Springboot base image" \
  "description"="Docker image for account transaction history service"

FROM artifactory.wureachprod.awswuintranet.net/hub-docker-prod/hub/alpine/3.20/openjdk/17:latest
USER root
COPY --from=intermediate / ./

# Set the home directory to our app user's home.
ENV APP_HOME=/home/apps
WORKDIR $APP_HOME

# Switch to application user
USER appuser

# Add a volume pointing to /tmp
VOLUME /tmp
#test kubernetes rollout
# Make port 8080 available to the world outside this container
EXPOSE 8005

# The application's jar file
ARG JAR_FILE=target/customer_profilelt_v2_svc-1.0.0.jar

# Add the application's jar to the container
COPY ${JAR_FILE} /customer_profilelt_v2_svc-1.0.0.jar
# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/customer_profilelt_v2_svc-1.0.0.jar"]