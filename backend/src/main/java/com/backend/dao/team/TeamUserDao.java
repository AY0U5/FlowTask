package com.backend.dao.team;

import com.backend.bean.team.TeamUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamUserDao extends JpaRepository<TeamUser,Long> {
    
}
