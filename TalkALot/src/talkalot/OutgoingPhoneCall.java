 

package talkalot;


public class OutgoingPhoneCall extends PhoneCall
{
    //Variables
    double callTime, callPrice;
    
    //Class Constructor
    public OutgoingPhoneCall(String phoneNumber, double time)
    {
        super(phoneNumber);
        callTime = time;
    }
    
    @Override
    double getCallPrice()
    {
        double callPrice;
        callPrice = callTime * .04;
        return callPrice;
    }
    
    @Override 
    public String getPhoneNum()
    {
        return this.phoneNumber;
    }
    
    @Override 
    public void getInfo()
    {
        System.out.println("Phone number: " + this.getPhoneNum());
        System.out.println("\nPrice per minute: 0.04");
        System.out.println("\nNumber of minutes: " + this.callTime);
        System.out.println("Total Price: " + getCallPrice());
    }





}
