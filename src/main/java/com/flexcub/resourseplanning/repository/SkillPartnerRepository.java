package com.flexcub.resourseplanning.repository;

import com.flexcub.resourseplanning.entity.SkillPartner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillPartnerRepository extends JpaRepository<SkillPartner,Integer> {
}
