package com.flexcub.resourseplanning.controller;

import com.flexcub.resourseplanning.entity.SkillPartner;
import com.flexcub.resourseplanning.service.SkillPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/req")
public class Controller {

    @Autowired
    SkillPartnerService service;

    @GetMapping(value = "/getData")
    public List<SkillPartner> getSkillPartnerDetails() {
        return service.getData();
    }

    @PostMapping(value = "/insertData")
    public SkillPartner insertSkillPartnerDetails(@RequestBody SkillPartner skillPartner) {
        return service.insertData(skillPartner);
    }

    @DeleteMapping(value = "/deleteData")
    public void deletaData(@RequestParam int id){
        service.deleteData(id);
    }

}
