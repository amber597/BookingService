package com.bookingservice.BookingService.model;

import com.bookingservice.BookingService.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long showId;

    @Column(columnDefinition = "jsonb")
    private String seats;

    private Double price;
    private BookingStatus bookingStatus;
}
