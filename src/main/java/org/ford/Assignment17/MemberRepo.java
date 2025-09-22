package org.ford.Assignment17;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member, Integer> {
}
