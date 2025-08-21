package org.ford.Layered_Application;

import java.util.Collection;

public interface WalletService {

    Wallet registerNewUserWallet(Wallet newWallet) throws ExistingUserException;
    Double addFundsToWalletByEmailID (String emailID, Double funds) throws InvalidAmountException, UserNotFoundException;
    Double withdrawFromWalletByEmailID (String EmailID , Double amount) throws InvalidAmountException, UserNotFoundException;
    Boolean transferFunds (String fromEmailID, String toEmailID, Double amount) throws InvalidAmountException,UserNotFoundException;
    Wallet getUserWalletByEmailID (String emailID) throws UserNotFoundException;
    Collection<Wallet> getAllWallets(String adminPassword) throws AcessDeniedException;


}
