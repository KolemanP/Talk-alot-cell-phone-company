/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talkalot;

/**
 *
 * @author cs0888866
 */
public abstract class PhoneCall {
    String phoneNumber;
    double callPrice;
    abstract double getcallPrice(){};
};
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    
   

    public void setCallPrice(double callPrice) {
        this.callPrice = callPrice;
    }    
    
    PhoneCall(String pNum){
        this.callPrice = 0.0;
    }
    
    
}
