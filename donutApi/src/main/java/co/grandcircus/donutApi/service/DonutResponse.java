package co.grandcircus.donutApi.service;

import java.util.List;

import co.grandcircus.donutApi.entity.Donuts;



public class DonutResponse {
	
	private Integer count;
	private List<Donuts> results;
	
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Donuts> getResults() {
		return results;
	}
	public void setResults(List<Donuts> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "DonutResponse [count=" + count + ", results=" + results + "]";
	}
	
	

}
