package com.bootcamp.transactionservice.repository;

import com.bootcamp.transactionservice.model.Transaction;
import io.reactivex.rxjava3.core.Flowable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.time.LocalDateTime;

public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {
    Flowable<Transaction> findByAccountIdAndDateTimeBetween(String accountId, LocalDateTime start, LocalDateTime end);

}