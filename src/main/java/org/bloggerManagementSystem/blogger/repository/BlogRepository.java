package org.bloggerManagementSystem.blogger.repository;

import org.bloggerManagementSystem.blogger.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

}
