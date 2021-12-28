package com.enigma.wallet.service;

import com.enigma.wallet.entity.Wallet;

import java.math.BigDecimal;
import java.util.List;

public interface WalletService {
    Wallet createNewWallet(Wallet wallet);
    List<Wallet> findAllWallet();
    void debit(String phoneNumber, BigDecimal amount);
}
