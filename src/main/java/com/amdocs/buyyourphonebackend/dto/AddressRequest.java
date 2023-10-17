package com.amdocs.buyyourphonebackend.dto;

public class AddressRequest {
        private String addressLine1;
        private String addressLine2;
        private String landmark;
        private String road;

        // Getters and setters
            // Getter methods
            public String getAddressLine1() {
                return addressLine1;
            }

            public String getAddressLine2() {
                return addressLine2;
            }

            public String getLandmark() {
                return landmark;
            }

            public String getRoad() {
                return road;
            }

            // Setter methods
            public void setAddressLine1(String addressLine1) {
                this.addressLine1 = addressLine1;
            }

            public void setAddressLine2(String addressLine2) {
                this.addressLine2 = addressLine2;
            }

            public void setLandmark(String landmark) {
                this.landmark = landmark;
            }

            public void setRoad(String road) {
                this.road = road;
            }

}
