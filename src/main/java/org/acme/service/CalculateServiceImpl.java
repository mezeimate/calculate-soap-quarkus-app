package org.acme.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

/**
 * Class that implement a CalculateService interface.
 * 
 * @author mezeimate
 */
@WebService(name = "CalculateService")
public class CalculateServiceImpl implements CalculateService {

	/**
	 * Exception message if the divider is zero.
	 */
	private static final String ZERO_DIVIDE_MSG = "Cannot devide by zero.";

	/**
	 * Sum web method.
	 */
	@WebMethod
	@Override
	public double sum(double a, double b) {
		return a + b;
	}

	/**
	 * Subtract web method.
	 */
	@WebMethod
	@Override
	public double subtract(double a, double b) {
		return a - b;
	}

	/**
	 * Multiply web method.
	 */
	@WebMethod
	@Override
	public double multiply(double a, double b) {
		return a * b;
	}

	/**
	 * Divide web method.
	 */
	@WebMethod
	@Override
	public double divide(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException(ZERO_DIVIDE_MSG);
		}
		return a / b;
	}
}
