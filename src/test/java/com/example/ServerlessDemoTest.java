package com.example;

import com.example.ServerlessDemoTest.BookServiceClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import io.micronaut.http.annotation.Get;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class ServerlessDemoTest {

    @Test
    void testItWorks(BookServiceClient client) {
        List<String> results = client.list();
        System.out.println("Results: " + results);
        assertEquals(2, results.size());
    }

    @Client("/books")
    interface BookServiceClient {
        @Get
        List<String> list();
    }

}
