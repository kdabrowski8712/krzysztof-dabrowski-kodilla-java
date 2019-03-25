package com.kodilla.hibernate2.manytomany.dao;

import com.kodilla.hibernate2.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company,Integer> {

//    @Query
//    List<Company> fineByPartOfCompanyName(@Param("NAMEPART") String namePart);

    @Query
    List<Company> fineByPartOfCompanyNameLike(@Param("NAMEPART") String namePart);

}
