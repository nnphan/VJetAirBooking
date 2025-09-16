package com.vjet.VjetAir.dtos;
import java.time.LocalDateTime;
import com.vjet.VjetAir.entities.Booking;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailNotificationDTO {

    private Long id;

    private String subject;

    private String recipientEmail;

    private String body;

    private Booking booking;

    private LocalDateTime createdDate;

    private boolean isHtml;
}
