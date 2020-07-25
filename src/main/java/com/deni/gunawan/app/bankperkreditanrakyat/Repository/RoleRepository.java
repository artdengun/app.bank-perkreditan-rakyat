package com.deni.gunawan.app.bankperkreditanrakyat.Repository;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.RoleSecurity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository  extends CrudRepository<RoleSecurity, String> {

    public List<RoleSecurity> findAll();
}
