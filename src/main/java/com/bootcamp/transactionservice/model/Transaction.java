package com.bootcamp.transactionservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;

    @NotBlank(message = "Account ID cannot be blank")
    private String accountId;

    @NotNull(message = "Amount cannot be null")
    @DecimalMin(value = "0.00", inclusive = false, message = "Amount must be greater than 0")
    private BigDecimal amount;

    @NotNull(message = "Transaction type cannot be null")
    private TransactionType type;

    @NotNull(message = "Date and time cannot be null")
    private LocalDateTime dateTime;

    @Size(max = 500, message = "Description must be 500 characters or less")
    private String description;

}
