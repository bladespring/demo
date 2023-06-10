package com.bladespring.demo.services;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bladespring.demo.json.Asssignment;
import com.bladespring.demo.json.AstroResult;

@SpringBootTest
public class AstroServiceTest {
    @Autowired
    private AstroService service;

    @Test
    void getAstronautsRT() {
        AstroResult result = service.getAstronautsRT();
        int number = result.number();
        System.out.println("There are " + number + " people in space");
        List<Asssignment> people = result.people();
        people.forEach(System.out::println);
        assertAll(
                () -> assertTrue(number >= 0),
                () -> assertEquals(number, people.size()));
    }

    @Test
    void getAstronautsWC() {
        AstroResult result = service.getAstronautsWC();
        int number = result.number();
        System.out.println("There are " + number + " people in space");
        List<Asssignment> people = result.people();
        people.forEach(System.out::println);
        assertAll(
                () -> assertTrue(number >= 0),
                () -> assertEquals(number, people.size()));
    }
}
