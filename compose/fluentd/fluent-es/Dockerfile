FROM fluent/fluentd:latest

USER fluent
WORKDIR /home/fluent
ENV PATH /home/fluent/.gem/ruby/2.2.0/bin:$PATH
RUN gem install fluent-plugin-elasticsearch

COPY ./fluent.conf /etc/fluent/
ENV CONFIG_PATH "/etc/fluent/fluent.conf"

EXPOSE 24284

CMD fluentd -c /fluentd/etc/$FLUENTD_CONF -p /fluentd/plugins $FLUENTD_OPT
