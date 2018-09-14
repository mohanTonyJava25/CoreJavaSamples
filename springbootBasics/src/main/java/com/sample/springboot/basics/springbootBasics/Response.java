package com.sample.springboot.basics.springbootBasics;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)

public class Response {
	 Args args;
	 @Autowired
	 Headers headers;
	 private String origin;
	 private String url;
	/**
	 * 
	 * ${response.url}
	 * @return the args
	 */
	public Args getArgs() {
		return args;
	}
	/**
	 * @param args the args to set
	 */
	public void setArgs(Args args) {
		this.args = args;
	}
	/**
	 * @return the headers
	 */
	public Headers getHeaders() {
		return headers;
	}
	/**
	 * @param headers the headers to set
	 */
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Response [args=" + args + ", headers=" + headers + ", origin=" + origin + ", url=" + url + "]";
	}
	 
	 
	 


}