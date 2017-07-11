package cn.edu.tongji.a508.controller;

import cn.edu.tongji.a508.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mark on 7/11/17.
 */

@RestController
@RequestMapping("city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public ResponseEntity getShanghai(){
        return new ResponseEntity(cityService.findCitiesByCountry("Shanghai"), HttpStatus.OK);
    }

    @RequestMapping(value = "json", method = RequestMethod.GET)
    public ResponseEntity getAll(){
        return new ResponseEntity(cityService.findCitiesByCountry("CN"), HttpStatus.OK);
    }
}
