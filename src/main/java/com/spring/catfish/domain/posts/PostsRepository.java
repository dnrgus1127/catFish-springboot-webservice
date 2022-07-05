package com.spring.catfish.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {


}

//  JpaRepository 상속으로 기본적인 CRUD 메소드들이 자동적으로 생성된다
