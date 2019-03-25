package com.robertmora.bookingriva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    //private List<ApartmentBooking> bookings;
    private BookingRepository bookingRepository;

    @Autowired
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
//        bookings = new ArrayList<>();
//
//        bookings.add(new ApartmentBooking("Marija", 40, 7));
//        bookings.add(new ApartmentBooking("Jure", 60, 7));
//        bookings.add(new ApartmentBooking("Aida", 40, 7));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<ApartmentBooking> getAll() {
        return bookingRepository.findAll();
    }

    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<ApartmentBooking> getAffordable(@PathVariable double price) {
        //return bookings.stream().filter(x -> x.getPrice() <= price)
//                .collect(Collectors.toList());
        return bookingRepository.findByPriceLessThan(price);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<ApartmentBooking> create(@RequestBody ApartmentBooking apartmentBooking) {
        //bookings.add(apartmentBooking);

        //return bookings;
        bookingRepository.save(apartmentBooking);
        return bookingRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<ApartmentBooking> remove(@PathVariable long id) {
        bookingRepository.deleteById(id);

        return bookingRepository.findAll();
    }
}
