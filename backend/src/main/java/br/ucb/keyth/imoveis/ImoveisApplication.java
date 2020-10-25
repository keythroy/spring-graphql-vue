package br.ucb.keyth.imoveis;

import br.ucb.keyth.imoveis.service.ImovelService;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ImoveisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImoveisApplication.class, args);
	}

    @Bean
    ApplicationRunner init(ImovelService ImovelService) {
        return args -> {
        //     Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
        //             "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
        //         Car car = new Car();
        //         car.setName(name);
        //         ImovelService.saveCar(car);
        //     });
            // ImovelService.getCars().forEach(System.out::println);
        };
    }
}
