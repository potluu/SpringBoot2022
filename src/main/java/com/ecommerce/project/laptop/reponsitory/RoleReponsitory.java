package com.ecommerce.project.laptop.reponsitory;

import com.ecommerce.project.laptop.entitty.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  RoleReponsitory extends JpaRepository<Role,Integer> {

}
