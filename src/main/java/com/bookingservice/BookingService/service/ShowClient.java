package com.bookingservice.BookingService.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "show-service")
public interface ShowClient {

    @GetMapping("/api/shows/confirm-booking")
    public ResponseEntity<String> confirmSeats(@RequestParam("userId") Long userId, @RequestParam("seatIds") List<Long> seatIds);

    @GetMapping("/api/shows/book-seats")
    public ResponseEntity<String> bookSeats(@RequestParam("userId") Long userId, @RequestParam("seatIds") List<Long> seatIds);
}
