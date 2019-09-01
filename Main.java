import java.util.Arrays;

public class Main {

    /**

        Hash = digital signature

        Each block will have:

            List of transactions
            Previous Hash
            Hash

     */

    public static void main(String[] args) {

        String[] genesisTransactions = {"satoshi sent me 999900 bitcoin","bill gates sent 10 bitcoins to me"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"I sent 10 bitcoin to satoshi", "satoshi sent 10 bitcoin to starbuck"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"I sent 999 bitcoin to my mom"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

    }


}
