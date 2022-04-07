package com.osiguranjeback.forex.services;

import com.osiguranjeback.forex.model.Forex;

import java.util.List;

public interface ForexService {
    void save(Forex forex);
    Forex getPair(String baseCurrency, String quoteCurrency);
    void saveAll(List<Forex> pairs);
}