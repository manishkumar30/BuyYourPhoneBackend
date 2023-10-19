package com.amdocs.buyyourphonebackend.Controller;

import com.amdocs.buyyourphonebackend.dto.AddressRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AddressController {

        private String userAddress = ""; // This variable simulates your database storage

    @PutMapping("/updateAddress")
    public String updateAddress(@RequestBody AddressRequest addressRequest) {
        // Merge address fields received in the request
        String mergedAddress = addressRequest.getAddressLine1() + ", " +
                addressRequest.getAddressLine2() + ", Landmark: " +
                addressRequest.getLandmark() + ", Road: " +
                addressRequest.getRoad();

        // Update the user's address in the "database"
        userAddress = mergedAddress;

        return "Address updated successfully!";
    }

        // Getter method to retrieve user's address (for demonstration purposes)
        @GetMapping("/getUserAddress")
        public String getUserAddress() {
            return userAddress;
        }

}
