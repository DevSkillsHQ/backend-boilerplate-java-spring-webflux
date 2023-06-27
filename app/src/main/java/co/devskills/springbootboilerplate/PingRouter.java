package co.devskills.springbootboilerplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static org.springframework.web.reactive.function.BodyInserters.fromValue;

@Configuration
public class PingRouter {

    @Bean
    public RouterFunction<ServerResponse> routePingPong() {
        return route()
                .GET("/ping", serverRequest -> ok().body(fromValue("PONG")))
                .build();
    }
}