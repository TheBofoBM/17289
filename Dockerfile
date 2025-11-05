FROM alpine
EXPOSE 80 
RUN apk add nginx
COPY ./ordinario-ftw /var/lib/nginx/html
COPY ./Adolfo.conf /etc/nginx/conf.d/default.conf
CMD ["nginx", "-g", "daemon off;"]