package com.sohu.jafka.consumer;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sohu.jafka.producer.serializer.Decoder;

public class MyConsumerConnector implements ConsumerConnector{

	public MyConsumerConnector(ConsumerConfig config){
		
	}
	
	@Override
	public <T> Map<String, List<MessageStream<T>>> createMessageStreams(
			Map<String, Integer> topicCountMap, Decoder<T> decoder) {
		// TODO Auto-generated method stub
		Map<String, List<MessageStream<T>>> result = new HashMap<String, List<MessageStream<T>>>();
		
		
		
		return result;
	}

	@Override
	public void commitOffsets() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
