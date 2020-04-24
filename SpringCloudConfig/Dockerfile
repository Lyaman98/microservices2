FROM centos
RUN yum install -y java
VOLUME /tmp
ADD /target/cloudconfig-0.0.1-SNAPSHOT.jar configserver.jar
RUN sh -c 'touch /configserver.jar'
ENTRYPOINT ["java","-jar","/configserver.jar"]
