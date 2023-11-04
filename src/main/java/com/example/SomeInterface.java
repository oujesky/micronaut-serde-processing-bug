package com.example;

import io.micronaut.serde.annotation.Serdeable;

import java.time.LocalDate;
import java.util.LinkedList;

@Serdeable.Deserializable(as = LinkedList.class)
@Serdeable.Serializable(as = LocalDate.class)
public interface SomeInterface {
}
