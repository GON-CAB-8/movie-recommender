package ar.cabralmartin.movierecommender.lesson2;

public class CollaborativeFilter implements Filter{

    public String[] getRecommendations(String movie) {

        return new String[]{"Happy Feet", "Ice Age", "Toy Story"};
    }
}
