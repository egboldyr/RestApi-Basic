package com.rest.sandbox.dao;

import com.rest.sandbox.domain.SandboxEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by EGBoldyr on 22.05.18.
 */

public interface SandboxRepository extends JpaRepository<SandboxEntity, Long> {

}
