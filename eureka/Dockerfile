FROM centos
RUN yum install -y java
VOLUME /tmp
ADD /target/eureka-0.0.1-SNAPSHOT.jar eureka.jar
RUN sh -c 'touch /eureka.jar'
ENTRYPOINT ["java","-jar","/eureka.jar"]
