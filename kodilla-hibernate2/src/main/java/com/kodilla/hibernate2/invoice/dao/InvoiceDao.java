package com.kodilla.hibernate2.invoice.dao;

import com.kodilla.hibernate2.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface InvoiceDao extends CrudRepository<Invoice,Integer> {
}
