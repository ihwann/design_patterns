package com.ilhwan.design_patterns.behavior_patterns.chain_responsibilities;

public class AuthRequestHandler extends RequestHandler {


    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }
}
