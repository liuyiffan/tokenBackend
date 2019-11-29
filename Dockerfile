FROM java:8
VOLUME /tmp
ADD target/handsup-0.0.1.jar app.jar
ADD 3159647_www.liudada.cn.pfx 3159647_www.liudada.cn.pfx
RUN bash -c 'touch /app.jar'
RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
&& echo 'Asia/Shanghai' >/etc/timezone
ENTRYPOINT ["java", "-Xmx400m", "-Djava.security.egd=file:/dev/ ./urandom", "-jar", "/app.jar"]