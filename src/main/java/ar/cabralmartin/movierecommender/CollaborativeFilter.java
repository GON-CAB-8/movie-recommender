package ar.cabralmartin.movierecommender;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CF")
public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {

        return new String[]{"Happy Feet", "Ice Age", "Toy Story"};
    }
}
