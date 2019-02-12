package org.github.jess.currencyrates.currencyratesmicroservice.data.repositories;

import org.github.jess.currencyrates.currencyratesmicroservice.data.domains.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    ExchangeValue findByToAndFrom(String from, String to);
}
