package ar.cabralmartin.movierecommender.lesson2;

public class ContentBasedFilter implements Filter{

    public String[] getRecommendations(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
