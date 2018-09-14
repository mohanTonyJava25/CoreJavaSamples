package com.sample.springboot.basics.springbootBasics;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Component
@JsonIgnoreProperties(ignoreUnknown=true)
public class Headers {
	
	 private String Accept;
	 private String acceptEncoding;
	 private String cacheControl;
	 private String Connection;
	 private String Host;
	 private String postmanToken;
	 private String userAgent;
	 
	 
	public Headers() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the accept
	 */
	public String getAccept() {
		return Accept;
	}


	/**
	 * @param accept the accept to set
	 */
	public void setAccept(String accept) {
		Accept = accept;
	}


	/**
	 * @return the acceptEncoding
	 */
	public String getAcceptEncoding() {
		return acceptEncoding;
	}


	/**
	 * @param acceptEncoding the acceptEncoding to set
	 */
	public void setAcceptEncoding(String acceptEncoding) {
		this.acceptEncoding = acceptEncoding;
	}


	/**
	 * @return the cacheControl
	 */
	public String getCacheControl() {
		return cacheControl;
	}


	/**
	 * @param cacheControl the cacheControl to set
	 */
	public void setCacheControl(String cacheControl) {
		this.cacheControl = cacheControl;
	}


	/**
	 * @return the connection
	 */
	public String getConnection() {
		return Connection;
	}


	/**
	 * @param connection the connection to set
	 */
	public void setConnection(String connection) {
		Connection = connection;
	}


	/**
	 * @return the host
	 */
	public String getHost() {
		return Host;
	}


	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		Host = host;
	}


	/**
	 * @return the postmanToken
	 */
	public String getPostmanToken() {
		return postmanToken;
	}


	/**
	 * @param postmanToken the postmanToken to set
	 */
	public void setPostmanToken(String postmanToken) {
		this.postmanToken = postmanToken;
	}


	/**
	 * @return the userAgent
	 */
	public String getUserAgent() {
		return userAgent;
	}


	/**
	 * @param userAgent the userAgent to set
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Headers [Accept=" + Accept + ", acceptEncoding=" + acceptEncoding + ", cacheControl=" + cacheControl
				+ ", Connection=" + Connection + ", Host=" + Host + ", postmanToken=" + postmanToken + ", userAgent="
				+ userAgent + "]";
	}
	
	
	 
	 
	 

}
