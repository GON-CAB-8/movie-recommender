package ar.cabralmartin.movierecommender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    @Autowired
    public RecommenderImplementation(@Qualifier("CBF") Filter filter) {
        super();
        this.filter = filter;
        System.out.println("Constructor executed...");
    }

    public String[] recommendMovies(String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");
        return filter.getRecommendations("Finding Dory");
    }
}
