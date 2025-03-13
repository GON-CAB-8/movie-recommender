package ar.cabralmartin.movierecommender;

public interface Filter {
    public String[] getRecommendations(String movie);
}
