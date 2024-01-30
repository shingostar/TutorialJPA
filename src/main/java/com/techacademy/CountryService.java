package com.techacademy;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private final CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }
    
    // 全件を検索して返す
    public List<Country> getCountryList() {
        // リポジトリのfindAllメソッドを呼び出す
        return repository.findAll();
    }
}