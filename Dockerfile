FROM openjdk:8-jdk-alpine

COPY CPUutilizationChecker.java .

RUN javac CPUutilizationChecker.java

CMD ["java", "CPUutilizationChecker"]
