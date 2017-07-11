package cn.edu.tongji.a508.repository.jpa;

import cn.edu.tongji.a508.domain.jpa.City;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by mark on 7/11/17.
 */
@Transactional
public interface CityRepository extends CrudRepository<City, Long> {

    City findCityByName(String name);

    List<City> findCitiesByCountry(String country);
}
