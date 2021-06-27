package com.github.mayconmorais20.citiesapi.states.repositories;

import com.github.mayconmorais20.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
