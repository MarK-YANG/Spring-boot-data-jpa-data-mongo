package cn.edu.tongji.a508.service;

import cn.edu.tongji.a508.domain.jpa.City;
import cn.edu.tongji.a508.repository.jpa.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by mark on 7/11/17.
 */
@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public Optional<City> findCityByName(String city) {
        return Optional.ofNullable(cityRepository.findCityByName(city));
    }

    public List<City> findCitiesByCountry(String country) {
        return cityRepository.findCitiesByCountry(country);
    }
}
