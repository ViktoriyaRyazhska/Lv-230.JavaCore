package homework3;

//1.c)read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)

public enum HTTPError {
	BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound, MethodNotAllowed, NotAcceptable, ProxyAuthenticationRequired
}
