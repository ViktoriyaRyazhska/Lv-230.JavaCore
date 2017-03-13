package com.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpErr {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter error number");
		int number = Integer.parseInt(br.readLine());

		switch (number) {
		case 400:
			System.out.println(HTTPError.BAD_REQUEST);
			break;
		case 401:
			System.out.println(HTTPError.UNAUTHORIZED);
			break;
		case 402:
			System.out.println(HTTPError.PAYMENT_REQUIRED);
			break;
		case 403:
			System.out.println(HTTPError.FORBIDDEN);
			break;
		case 404:
			System.out.println(HTTPError.PAGE_NOT_FOUND);
			break;
		case 405:
			System.out.println(HTTPError.METHOD_NOT_ALLOWED);
			break;
		default:
			System.out.println("NO SUCH ERROR");
			break;
		}

	}
}
