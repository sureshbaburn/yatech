package com.yamtes.rest.webservices.restful.webservices.jpa;

import com.yamtes.rest.webservices.restful.webservices.user.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRespository extends JpaRepository<User,Integer> {


}
