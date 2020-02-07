package com.lzxs.dengji.service;

import com.lzxs.dengji.dao.RegistrationMapper;
import com.lzxs.dengji.domain.Registration;
import com.lzxs.dengji.domain.RegistrationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationMapper registrationMapper;
    public int insert(Registration registration) {
        return registrationMapper.insert(registration);
    }

    public List<Registration> selectAll() {
        return registrationMapper.selectByExample(new RegistrationExample());
    }

    public int deleteregbyid(Integer id) {
        return registrationMapper.deleteByPrimaryKey(id);
    }

    public List<Registration> findbyexample(Registration registration) {
        RegistrationExample registrationExample = new RegistrationExample();
        registrationExample.createCriteria().andIdcardEqualTo(registration.getIdcard());
        registrationExample.createCriteria().andUsernameEqualTo(registration.getUsername());
        registrationExample.createCriteria().andRigisterdataEqualTo(registration.getUsername());
        return registrationMapper.selectByExample(registrationExample);
    }
}
