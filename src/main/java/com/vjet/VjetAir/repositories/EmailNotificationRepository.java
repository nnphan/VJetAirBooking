package com.vjet.VjetAir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vjet.VjetAir.entities.EmailNotification;

public interface EmailNotificationRepository extends JpaRepository<EmailNotification, Long>
{


}
