package com.example.Sondage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Sondage.model.RoleName;
import com.example.Sondage.model.Role;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}