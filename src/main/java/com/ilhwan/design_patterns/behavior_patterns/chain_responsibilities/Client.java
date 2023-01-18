package com.ilhwan.design_patterns.behavior_patterns.chain_responsibilities;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(
            new LoggingRequestHandler(new PrintRequestHandler(null)));

        Client client = new Client(chain);
        client.doWork();
    }

}
