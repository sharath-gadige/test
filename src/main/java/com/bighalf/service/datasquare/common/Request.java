package com.bighalf.service.datasquare.common;

/**
 * @author Tao Zhong
 *
 * Jun 25, 2015
 */
public class Request  {

	private Header header;
	private Body body;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}

}
