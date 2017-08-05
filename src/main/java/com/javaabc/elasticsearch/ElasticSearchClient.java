package com.javaabc.elasticsearch;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

public class ElasticSearchClient {
	public static void main(String[] args) throws UnknownHostException {
		TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.16.83.182"), 9300));
		SearchResponse sr = client.prepareSearch()
				.setQuery(QueryBuilders.matchQuery("message", "myProduct"))
				.addAggregation(AggregationBuilders.terms("top_10_states")
						.field("state").size(10))
				.execute().actionGet();
		client.close();
	}
}
