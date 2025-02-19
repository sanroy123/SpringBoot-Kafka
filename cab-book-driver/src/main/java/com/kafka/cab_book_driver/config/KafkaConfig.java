package com.kafka.cab_book_driver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.kafka.cab_book_driver.constant.AppConstant;

@Configuration
public class KafkaConfig {
	
	private static final String CAB_LOCATION = "cab-location";

	@Bean
	public NewTopic topic() {
		return TopicBuilder
				.name(AppConstant.CAB_LOCATION)
				.build();
	}

}
