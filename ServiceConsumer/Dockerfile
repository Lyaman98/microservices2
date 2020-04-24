FROM centos
RUN yum install -y java
VOLUME /tmp
ADD /target/serviceconsumer-0.0.1-SNAPSHOT.jar serviceconsumer.jar
RUN sh -c 'touch /serviceconsumer.jar'
ENTRYPOINT ["java","-jar","/serviceconsumer.jar"]
