package com.example.data.repository;


import com.example.data.bean.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

    @Query("from User as u"
            + " where u.name like %:name%")
    List<User> findByName(@Param("name") String name);
}
