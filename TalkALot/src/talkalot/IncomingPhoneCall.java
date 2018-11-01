/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talkalot;

/**
 *
 * @author kp0885055
 */
public class IncomingPhoneCall extends PhoneCall{ 
    double price = 0.02;

    public IncomingPhoneCall(String pNum) {
        super(pNum);
    }

    @Override
    double getCallPrice() {
       return price = 0.02;
    }

    @Override
    String getPhoneNum(String phoneNumber) {
        super(phoneNumber); 
    }

    @Override
    void getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
