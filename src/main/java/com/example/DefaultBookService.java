package com.example;

import io.micronaut.context.annotation.Requires;
import jakarta.inject.Singleton;
import java.util.List;

/**
 *
 * @author sseighma
 */
@Singleton
@Requires(missingBeans=BookService.class)
public class DefaultBookService
    implements BookService {

    @Override
    public List<String> listTitles() {
        return List.of(
            "Learning Micronaut",
            "Micronaut Serverless"
        );
    }
}
