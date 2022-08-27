package com.techelevator.tenmo.controller;

import com.techelevator.tenmo.dao.AccountDao;
import com.techelevator.tenmo.dao.JdbcTransferDao;
import com.techelevator.tenmo.dao.TransferDao;
import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.Transfer;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@PreAuthorize("isAuthenticated()")
public class TransferController {


    private TransferDao transferDao;







    public TransferController(JdbcTransferDao transferDao) {
        this.transferDao = transferDao;
    }


    @PostMapping(value = "transfers")
    public Transfer create(@RequestBody Transfer transfer) {
       return transferDao.create(transfer);
    }
}
