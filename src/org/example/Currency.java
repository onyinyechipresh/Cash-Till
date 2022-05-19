package org.example;

import java.util.ArrayList;

    public abstract class Currency {

        int balance;


        public Currency() {
        }

        public Currency(int balance) {
            this.balance = balance;
        }


        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public abstract String buy(int currency, String goods);
    }


