package com.hb.strategydesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 * Concrete strategy. Implements Paypal payment method
 * */
public class PayByPayPal implements PayStrategy{

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("Jonathan1999","cindanojonathan@icloud.com");
        DATA_BASE.put("azertyuiop","lefevremarc@icloud.com");
    }

    /*
    * Collects customer's data
    * */

    @Override
    public void collectPaypalDetails() {
        try{
            while(!signedIn){
                System.out.println("Enter the user email: ");
                email = READER.readLine();
                System.out.println("Enter the password");
                password = READER.readLine();
                if(verify()){
                    System.out.println("Data verification has successfully");
                } else {
                    System.out.println("Wrong email or password");
                }
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    private boolean verify(){
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    /*
    * Save customers data for future shopping attempts
    * */
    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn){
            System.out.println("Paying " + paymentAmount+ " using PayPal.>");
        }
        return false;
    }


}
