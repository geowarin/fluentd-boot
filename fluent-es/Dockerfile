FROM fluent/fluentd:latest

USER fluent
WORKDIR /home/fluent
ENV PATH /home/fluent/.gem/ruby/2.2.0/bin:$PATH
RUN gem install fluent-plugin-elasticsearch

EXPOSE 24284
VOLUME /fluentd/log

CMD fluentd -c /fluentd/etc/$FLUENTD_CONF -p /fluentd/plugins $FLUENTD_OPT
