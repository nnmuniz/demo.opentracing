FROM fabric8/java-alpine-openjdk8-jre
ARG JAR_FILE=target/demo.opentracing.jar
COPY ${JAR_FILE} app.jar
ENV JAEGER_SERVICE_NAME=demo.opentracing
EXPOSE 8080 8778 9779
ENTRYPOINT ["java","-jar","/app.jar"]