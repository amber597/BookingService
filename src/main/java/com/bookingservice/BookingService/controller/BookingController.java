package com.bookingservice.BookingService.controller;

import com.bookingservice.BookingService.service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/book-seat")
    public ResponseEntity<String> bookSeats(@RequestParam Long userId, @RequestParam List<Long> seatIds) {
        bookingService.bookSeat(userId, seatIds);
        return ResponseEntity.ok("Seats are successfully booked");
    }
}

