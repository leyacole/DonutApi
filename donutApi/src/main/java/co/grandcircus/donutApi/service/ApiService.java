package co.grandcircus.donutApi.service;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.donutApi.entity.DonutDetail;
import co.grandcircus.donutApi.entity.Donuts;

//import co.grandcircus.donutApi.entity.Donuts;

@Component
public class ApiService {
	
private RestTemplate restTemplate = new RestTemplate();
	
	// This is an instance initialization block. It runs when a new instance of the class is created--
	// right before the constructor.
	{
	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
		
	public DonutResponse getDonutList() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		DonutResponse donut = restTemplate.getForObject(url, DonutResponse.class);
		return donut;
	}
	
	public DonutDetail getById(Long id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id +".json";
		DonutDetail donut = restTemplate.getForObject(url, DonutDetail.class);
		return donut;
	}

}
