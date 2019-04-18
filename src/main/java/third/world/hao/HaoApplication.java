package third.world.hao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;


@SpringBootApplication
public class HaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaoApplication.class, args);
    }


}
