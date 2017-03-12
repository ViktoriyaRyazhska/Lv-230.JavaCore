package week2.thursday.homework.task1.c;

public enum HTTPError {
    BAD_REQUEST {
        @Override
        public String toString() {
            return "Name: Bad Request\n" +
                    "The server cannot or will not process the request due to an apparent client error " +
                    "(e.g., malformed request syntax, too large size, invalid request message framing, " +
                    "or deceptive request routing).";
        }
    }, UNAUTHORIZED {
        @Override
        public String toString() {
            return "Name: Unauthorized\n" +
                    "Similar to 403 Forbidden, but specifically for use when authentication is required " +
                    "and has failed or has not yet been provided.";
        }
    }, PAYMENT_REQUIRED {
        @Override
        public String toString() {
            return "Name: Payment Required\n" +
                    "Reserved for future use. " +
                    "The original intention was that this code might be used " +
                    "as part of some form of digital cash or micropayment scheme, " +
                    "but that has not happened, and this code is not usually used.";
        }
    }, FORBIDDEN {
        @Override
        public String toString() {
            return "Name: Forbidden\n" +
                    "The request was valid, but the server is refusing action. " +
                    "The user might not have the necessary permissions for a resource.";
        }
    }, NOT_FOUND {
        @Override
        public String toString() {
            return "Name: Not Found\n" +
                    "The requested resource could not be found but may be available in the future. " +
                    "Subsequent requests by the client are permissible.";
        }
    }
}
