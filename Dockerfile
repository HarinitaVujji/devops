FROM tomcat:10.1-jdk21-temurin

RUN rm -rf /usr/local/tomcat/webapps/* && \
    useradd -m appuser && \
    chown -R appuser /usr/local/tomcat

COPY --chown=appuser target/*.war /usr/local/tomcat/webapps/ROOT.war

USER appuser

EXPOSE 8080

CMD ["catalina.sh", "run"]
