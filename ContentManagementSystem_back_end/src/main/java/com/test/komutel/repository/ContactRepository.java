package com.test.komutel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.komutel.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
