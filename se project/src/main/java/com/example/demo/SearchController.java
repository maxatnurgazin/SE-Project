package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class SearchController {
    private List<Route> routes;

    @Autowired
    RouteRepository routeRepository;

    @RequestMapping("/search")
    public List<Route> search(@RequestParam(value="or") String origin, @RequestParam(value="dest") String destination,
                              @RequestParam(value="date") String date) {

        routes = routeRepository.findAllByOriginEquals(origin);
        List<Route> results = new LinkedList<>();

        for(Route r : routes){
            if (r.getDestination().equalsIgnoreCase(destination) && r.getDeparture().equalsIgnoreCase(date)) {
                results.add(r);
            }
        }
        return results;
    }
}
