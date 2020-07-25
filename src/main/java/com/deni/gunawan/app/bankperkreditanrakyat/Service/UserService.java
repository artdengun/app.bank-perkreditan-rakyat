package com.deni.gunawan.app.bankperkreditanrakyat.Service;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.RoleSecurity;
import com.deni.gunawan.app.bankperkreditanrakyat.Entity.UserSecurity;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.RoleRepository;
import com.deni.gunawan.app.bankperkreditanrakyat.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;

    public List<RoleSecurity> listRole(){
        return this.roleRepository.findAll();
    }

    public List<UserSecurity> findUser(){
        return this.userRepository.findAll();
    }

    public UserSecurity findByNama(String nama) {
        return this.userRepository.findByNama(nama);
    }

}
