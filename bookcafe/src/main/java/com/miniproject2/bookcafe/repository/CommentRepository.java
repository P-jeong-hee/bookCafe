package com.miniproject2.bookcafe.repository;

import com.miniproject2.bookcafe.domain.Comment;
import com.miniproject2.bookcafe.domain.Moim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
