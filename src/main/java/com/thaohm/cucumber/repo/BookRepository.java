package com.thaohm.cucumber.repo;

import com.thaohm.cucumber.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by thaohm on 7/26/16.
 */
@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BookRepository extends JpaRepository<Book, Long> {
}