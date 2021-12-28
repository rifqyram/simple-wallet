package com.enigma.wallet.repository;

import com.enigma.wallet.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, String> {
    public Wallet findWalletByPhoneNumber(String phoneNumber);
}
