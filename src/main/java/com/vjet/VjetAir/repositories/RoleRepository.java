package com.vjet.VjetAir.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vjet.VjetAir.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>
{
    Optional<Role> findByName(String name);
}
