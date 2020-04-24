FROM centos
RUN yum install -y java
VOLUME /tmp
ADD /target/serviceprovider-0.0.1.jar serviceprovider.jar
RUN sh -c 'touch /serviceprovider.jar'
ENTRYPOINT ["java","-jar","serviceprovider.jar"]
