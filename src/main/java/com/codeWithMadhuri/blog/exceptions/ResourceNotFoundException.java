package com.codeWithMadhuri.blog.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
	
	String resourceName;
	String feildName;
	long feildValue;
	public ResourceNotFoundException(String resourceName, String feildName, long feildValue) {
		super(String.format("%s not found with %s:%l",resourceName,feildName,feildValue));
		this.resourceName = resourceName;
		this.feildName = feildName;
		this.feildValue = feildValue;
	}
	
	
	

}
