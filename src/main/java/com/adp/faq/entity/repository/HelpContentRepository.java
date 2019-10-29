package com.adp.faq.entity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adp.faq.entity.HelpCategory;

@Repository
public interface HelpContentRepository extends CrudRepository<HelpCategory, Long> {

}