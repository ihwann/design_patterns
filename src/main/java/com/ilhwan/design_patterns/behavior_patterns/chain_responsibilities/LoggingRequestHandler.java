package com.ilhwan.design_patterns.behavior_patterns.chain_responsibilities;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅..");
        super.handle(request);
    }
}
