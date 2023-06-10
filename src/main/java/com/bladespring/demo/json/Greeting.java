package com.bladespring.demo.json;

public class Greeting {
    private final String message;

    public Greeting() {
        this(null);
    }

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Greeting{" + "message='" + message + "'}";
    }
}
