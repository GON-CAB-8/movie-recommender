package ar.cabralmartin.movierecommender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {


    private Filter filter;

    public String [] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }

    @Autowired
    @Qualifier("CF")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked...");
    }
}
