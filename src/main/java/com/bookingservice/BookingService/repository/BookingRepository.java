package com.bookingservice.BookingService.repository;

import com.bookingservice.BookingService.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
