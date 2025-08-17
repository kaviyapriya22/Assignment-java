package org.ford.oops;

abstract class PaymentGateway {

    String apikey;
    String apiURL;
    public PaymentGateway(String apikey, String apiURL) {
        this.apikey = apikey;
        this.apiURL = apiURL;
    }
    public void connect(String gatewayname){
        System.out.println(" Conected to gateway"+gatewayname);

    }
    public void disconnect(String gatewayname){
        System.out.println("Disconnected to gateway"+gatewayname);
    }

}
