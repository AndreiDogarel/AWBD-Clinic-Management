package com.clinic.clinic.file;

import com.clinic.clinic.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileJpaRepo extends JpaRepository<FileEntity, Long> {
    Optional<FileEntity> findByUser(User user);
}
