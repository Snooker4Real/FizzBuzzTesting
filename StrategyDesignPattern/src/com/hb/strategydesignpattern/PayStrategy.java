package com.hb.strategydesignpattern;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaypalDetails();
}
