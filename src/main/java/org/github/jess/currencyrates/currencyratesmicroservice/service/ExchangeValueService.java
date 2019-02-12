package org.github.jess.currencyrates.currencyratesmicroservice.service;

import org.github.jess.currencyrates.currencyratesmicroservice.data.domains.ExchangeValue;
import org.github.jess.currencyrates.currencyratesmicroservice.data.repositories.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeValueService {

    ExchangeValueRepository repository;

    public ExchangeValueService(ExchangeValueRepository repository) {
        this.repository = repository;
    }

    public ExchangeValue findByToAndFro(String from, String to){
        return repository.findByToAndFrom(from, to);
    }

}
