package com.blooddonor.blooddonor_registration;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/donors")
@CrossOrigin(origins = "*")
public class DonorController {

private final DonorRepository donorRepository;

public DonorController(DonorRepository donorRepository) {
    this.donorRepository = donorRepository;
}

@PostMapping
public ResponseEntity<Donor> addDonor(@RequestBody Donor donor) {

    Donor savedDonor = donorRepository.save(donor);

    return ResponseEntity.ok(savedDonor);
}

}