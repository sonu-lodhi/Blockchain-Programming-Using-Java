package org.example;

import java.util.ArrayList;

public class BlockchainMainClass {

    /**
     *
     *  Hash = digital signature
     *
     *  Each block will have:
     *      List of transaction
     *      previous Hash
     *
     *      Hash
     *
     *
     */

    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        String[] usktgBlock1Transactions = {"Rahul sent mohit 1000000 bitcoin", "Rohit sent 10 bicoins to mohit"};
        Block usktgBlock1 = new Block(0, usktgBlock1Transactions);

        String[] usktgBlock2Transactions = {"mohit sent 10 bitcoin to santosh", "santosh sent 10 bitcoin to sonu"};
        Block usktgBlock2 = new Block(usktgBlock1.getBlockHash(), usktgBlock2Transactions);

        String[] usktgBlock3Transactions = {"krishna sent 10 bitcoin to mahesh", "mahesh sent 10 bitcoin to jiya"};
        Block usktgBlock3 = new Block(usktgBlock2.getBlockHash(), usktgBlock3Transactions);

        System.out.println("Hash of usktg block 1:");
        System.out.println(usktgBlock1.getBlockHash());

        System.out.println("Hash of usktg block 2:");
        System.out.println(usktgBlock2.getBlockHash());

        System.out.println("Hash of usktg block 3:");
        System.out.println(usktgBlock3.getBlockHash());
    }
}
