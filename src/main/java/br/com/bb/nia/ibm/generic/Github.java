package br.com.bb.nia.ibm.generic;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class Github {
    private String repository;

    public String getRepository() {
        return repository;
    }

    public Github() {
    }

    @JsonbCreator
    public static Github create(@JsonbProperty("repository") String repository) {
        return new Github(repository);
    }

    private Github(String repository) {
        this.repository = repository;
    }
}
