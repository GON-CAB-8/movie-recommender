package ar.cabralmartin.movierecommender.lesson1;

public class RecommenderImplementation {

    public String[] recommendMovies(String movie) {
        ContentBasedFilter filter = new ContentBasedFilter();

        return filter.getRecommendations(movie);
    }
}
