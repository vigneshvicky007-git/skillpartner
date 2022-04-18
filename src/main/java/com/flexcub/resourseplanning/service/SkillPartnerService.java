package com.flexcub.resourseplanning.service;

import com.flexcub.resourseplanning.entity.SkillPartner;
import com.flexcub.resourseplanning.repository.SkillPartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillPartnerService {

    @Autowired
    SkillPartnerRepository repository;

    public List<SkillPartner> getData() {
        return repository.findAll();
    }

    public SkillPartner insertData(SkillPartner skillPartner) {
        repository.save(skillPartner);
        return skillPartner;
    }

    public void deleteData(int id) {
        repository.deleteById(id);
    }
}
