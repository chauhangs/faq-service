package com.adp.faq.entity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adp.faq.entity.HelpFaq;

@Repository
public interface HelpFaqRepository extends CrudRepository<HelpFaq, Long> {

}