package com.web.sundragon4.repository;

import com.web.sundragon4.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
