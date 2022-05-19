package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Withdraw extends org.example.Currency implements org.example.WithdrawalServiceInterface, Storage{
//    ArrayList<String>amount = new ArrayList();



    public Withdraw() {
        product.put("Milo", 150);

        remainingBal.add(new Integer[]{500, 5});
        remainingBal.add(new Integer[]{200, 3});
        remainingBal.add(new Integer[]{100, 5});
        remainingBal.add(new Integer[]{50, 3});
        remainingBal.add(new Integer[]{20, 4});
        remainingBal.add(new Integer[]{10, 2});
        remainingBal.add(new Integer[]{5, 4});
        System.out.println(product);
//        System.out.println(Arrays.deepToString(new ArrayList[]{(remainingBal)}));;

        for(var vals : remainingBal){
            System.out.println(Arrays.toString(vals));
        }



    }

    @Override
    public String buy(int currency, String goods) {
//            for(var prod : product.entrySet()){
//
//            }
        int good_price = 0;
        if (product.containsKey(goods)) {
            good_price = product.get(goods);
        } else {
            return "Goods not Available";
        }

        int change = currency - good_price;
        setBalance(change);

        return null;
    }

    public void remainingBalance() {
        int balance = getBalance();
        List<Integer> remainder = new ArrayList<Integer>();
        while (true) {
            for (int i = 0; i < remainingBal.size(); i++) {
                if (balance > remainingBal.get(i)[0]) {
                    remainingBal.get(i)[0 + 1] -= 1;
                    remainder.add(remainingBal.get(i)[0]);
                    balance = remainingBal.get(i)[0] - balance;
                } else {
                    remainingBal.get(i + 1)[0 + 1] -= 1;
                    remainder.add(remainingBal.get(i + 1)[0]);
                    balance = remainingBal.get(i + 1)[0] - balance;
                    if(balance <= 0) break;
                }

            }

            System.out.println(Arrays.toString(new List[]{remainder}));
            for (var vals : remainingBal) {
                System.out.println(Arrays.toString(vals));
            }

        }
    }
}

