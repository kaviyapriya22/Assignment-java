package org.ford.Layered_Application;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WalletServiceImpl implements WalletService {

    Map<String, Wallet> userWallets = new HashMap<>();


    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws ExistingUserException {
        if (userWallets.containsKey(newWallet.getEmail())) {
            throw new ExistingUserException(newWallet.getEmail()+ " already exists");
        }
        else{
            this.userWallets.put(newWallet.getEmail(), newWallet);

        }
        return newWallet;

    }

    @Override
    public Double addFundsToWalletByEmailID(String emailID, Double funds) throws InvalidAmountException,UserNotFoundException {

        if (funds ==null ||funds < 1) {
            throw new InvalidAmountException("Enter valid Fund: " + funds);

        }
        else{
            if (userWallets.containsKey(emailID)) {

                Wallet wallet = userWallets.get(emailID);
                System.out.println(" Balance before adding fund: "+wallet.getBalance());
                wallet.setBalance(wallet.getBalance() + funds);
                return wallet.getBalance();
            }
            else{
                throw new UserNotFoundException(emailID + " does not exist");
            }

        }
    }


    @Override
    public Double withdrawFromWalletByEmailID(String emailID, Double amount) throws InvalidAmountException,UserNotFoundException {

        if (amount ==null ||amount < 1) {
            throw new InvalidAmountException("Enter valid Fund: " + amount);

        }
        else{
            if (userWallets.containsKey(emailID)) {

                Wallet wallet = userWallets.get(emailID);
                System.out.println(" Balance before withdrawing amount: "+wallet.getBalance());
                wallet.setBalance(wallet.getBalance() - amount);
                return wallet.getBalance();
            }
            else{
                throw new UserNotFoundException(emailID + " does not exist");
            }

        }
    }

    @Override
    public Boolean transferFunds(String fromEmailID, String toEmailID, Double amount) throws InvalidAmountException,UserNotFoundException {

        if (amount ==null ||amount < 1) {
            throw new InvalidAmountException("Enter valid Fund: " + amount);
        }
        else{
            if (userWallets.containsKey(fromEmailID) && userWallets.containsKey(toEmailID)) {
                Wallet senderWallet = userWallets.get(fromEmailID);
                Wallet totWallet = userWallets.get(toEmailID);
                System.out.println(" Balance before transfer amount for "+senderWallet.getName()+" "+senderWallet.getBalance());
                senderWallet.setBalance(senderWallet.getBalance() - amount);
                System.out.println(" Balance after transfer amount for "+senderWallet.getName()+" "+senderWallet.getBalance());
                System.out.println(" Balance before transfer amount for "+totWallet.getName()+" "+totWallet.getBalance());
                totWallet.setBalance(totWallet.getBalance() + amount);
                System.out.println(" Balance after  transfer amount for "+totWallet.getName()+" "+totWallet.getBalance());
                return true;
            }
            else{
                throw new UserNotFoundException(fromEmailID +" or "+toEmailID+ " does not exist");
            }

        }
    }

    @Override
    public Wallet getUserWalletByEmailID(String emailID) throws UserNotFoundException {

        if (userWallets.containsKey(emailID)) {
            return userWallets.get(emailID);
        }
        else{
            throw new UserNotFoundException(emailID + " does not exist");
        }
    }

    @Override
    public Collection<Wallet> getAllWallets(String adminPassword) throws AcessDeniedException {

        if ("admin123".equals(adminPassword))  {
            return userWallets.values();
        } else {
            throw new AcessDeniedException("Admin Password Error");
        }

    }
}
