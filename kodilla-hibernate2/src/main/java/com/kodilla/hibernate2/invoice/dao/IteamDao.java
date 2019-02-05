package com.kodilla.hibernate2.invoice.dao;

import com.kodilla.hibernate2.invoice.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface IteamDao extends CrudRepository<Item,Integer> {
}


