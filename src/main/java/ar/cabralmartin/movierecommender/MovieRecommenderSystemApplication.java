package ar.cabralmartin.movierecommender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //Dependency Injection using constructor
        /*System.out.println("Constructor injection in RecommenderImplementation class");
        RecommenderImplementation recommender = ctx.getBean(RecommenderImplementation.class);
        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));*/

        //Dependency Injection using setter
        System.out.println("Setter injection in RecommenderImplementation2 class");
        RecommenderImplementation2 recommender2 = ctx.getBean(RecommenderImplementation2.class);
        String []result = recommender2.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
    }

}
