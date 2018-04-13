# Streaming example with Spring Cloud Data Flow

Example for the blog post: http://zoltanaltfatter.com/2017/08/24/streaming-with-spring-cloud-data-flow 



Download and Install wget :
================================
http://gnuwin32.sourceforge.net/packages/wget.htm

Download and Install Rabittmq : start Rabittmq


Data Flow Server :  Dashboard - UI
=====================================
>wget http://repo.spring.io/milestone/org/springframework/cloud/spring-cloud-dataflow-server-local/1.3.0.M1/spring-cloud-dataflow-server-local-1.3.0.M1.jar

>java -jar spring-cloud-dataflow-server-local-1.3.0.M1.jar


Spring Cloud Data FLow Shell : 
=====================================
>wget http://repo.spring.io/milestone/org/springframework/cloud/spring-cloud-dataflow-shell/1.3.0.M1/spring-cloud-dataflow-shell-1.3.0.M1.jar

>java -jar spring-cloud-dataflow-shell-1.3.0.M1.jar


Register Apps :
======================================
> app register --name source --type source --uri maven://com.dataflow:source:jar:0.0.1-SNAPSHOT

> app register --name processor --type processor --uri maven://com.dataflow:processor:jar:0.0.1-SNAPSHOT 

> app register --name sink --type sink --uri maven://com.dataflow:sink:jar:0.0.1-SNAPSHOT 

> app list


Create Stream :
======================================
> stream create --name dataflowStream --definition 'source | processor | sink'

> stream list


Deploy Stream :
======================================
> stream deploy --name dataflowStream

> stream list


UnDeploy Stream :
====================================== 
> stream undeploy --name dataflowStream

> stream list

 