package com.zemoso.pool.Repository;

import com.zemoso.pool.domain.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Integer> {
}
