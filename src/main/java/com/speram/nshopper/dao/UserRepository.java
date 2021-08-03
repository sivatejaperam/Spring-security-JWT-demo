package com.speram.nshopper.dao;

import com.speram.nshopper.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
