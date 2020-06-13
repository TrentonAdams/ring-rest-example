FROM clojure:openjdk-8 AS build

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

COPY project.clj /usr/src/app/
RUN lein ring uberjar
COPY src /usr/src/app/src
COPY resources /usr/src/app/resources
COPY test /usr/src/app/test
RUN lein ring uberjar

FROM build as final
COPY --from=build \
/usr/src/app/target/uberjar/ring-rest-example-0.1.0-SNAPSHOT-standalone.jar \
/usr/src/app

#CMD ["lein", "ring", "server-headless"]
CMD ["java", "-jar", "/usr/src/app/target/uberjar/ring-rest-example-0.1.0-SNAPSHOT-standalone.jar"]