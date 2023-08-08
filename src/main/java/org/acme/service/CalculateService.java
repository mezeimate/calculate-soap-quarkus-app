package org.acme.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

/**
 * Interface that describes a Calculate web service.
 * 
 * @author mezeimate
 */
@WebService(name = "CalculateService", serviceName = "CalculateService")
public interface CalculateService {

	@WebMethod
	public double sum(double a, double b);

	@WebMethod
	public double subtract(double a, double b);

	@WebMethod
	public double multiply(double a, double b);

	@WebMethod
	public double divide(double a, double b);

}
