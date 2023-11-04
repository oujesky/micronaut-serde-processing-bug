package com.example;

import io.micronaut.serde.ObjectMapper;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@MicronautTest
class MicronautSerdeProcessingBugTest {

    @Inject
    private ObjectMapper jsonMapper;

    @Test
    void testDeserialize() throws IOException {
        jsonMapper.readValue("{}", SomeInterface.class);
    }

    @Test
    void testSerialize() throws IOException {
        jsonMapper.writeValueAsString(new SomeInterface() {});
    }

}
