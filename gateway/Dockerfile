FROM centos
RUN yum install -y java
VOLUME /tmp
ADD /target/gateway-0.0.1-SNAPSHOT.jar gateway.jar
RUN sh -c 'touch /gateway.jar'
ENTRYPOINT ["java","-jar","/gateway.jar"]
