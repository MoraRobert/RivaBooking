package com.robertmora.bookingriva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//        List<ApartmentBooking> bookings = new ArrayList<>();
//
//        bookings.add(new ApartmentBooking("Marija", 40, 7));
//        bookings.add(new ApartmentBooking("Jure", 60, 7));
//        bookings.add(new ApartmentBooking("Aida", 70, 7));
//
//        bookingRepository.save(bookings);

        bookingRepository.save(new ApartmentBooking("Marija", 40, 7));
        bookingRepository.save(new ApartmentBooking("Jure", 60, 7));
        bookingRepository.save(new ApartmentBooking("Aida", 70, 7));
    }
}
