package org.bloggerManagementSystem.blogger.repository;

import org.bloggerManagementSystem.blogger.entity.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InteractionRepository extends JpaRepository<Interaction, Long> {
}
