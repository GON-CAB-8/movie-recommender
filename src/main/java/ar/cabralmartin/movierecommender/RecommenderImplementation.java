package ar.cabralmartin.movierecommender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("CF")
    private Filter filter;

    public String [] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
