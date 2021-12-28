package com.enigma.wallet.service;

import com.enigma.wallet.entity.Wallet;
import com.enigma.wallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class WalletServiceImpl implements WalletService{

    @Autowired
    WalletRepository walletRepository;

    @Override
    public Wallet createNewWallet(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    @Override
    public List<Wallet> findAllWallet() {
        return walletRepository.findAll();
    }

    @Override
    public void debit(String phoneNumber, BigDecimal amount) {
        Wallet wallet = walletRepository.findWalletByPhoneNumber(phoneNumber);
        wallet.setBalance(wallet.getBalance().subtract(amount));
        walletRepository.save(wallet);
    }
}
