FROM mysql:latest

#ENV MYSQL_USER root
ENV MYSQL_ROOT_PASSWORD 26156276
ENV MYSQL_DATABASE micro2
#ENV MYSQL_PASSWORD 26156276


ADD micro2.sql /docker-entrypoint-initdb.d


EXPOSE 3306