package org.falconson.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
