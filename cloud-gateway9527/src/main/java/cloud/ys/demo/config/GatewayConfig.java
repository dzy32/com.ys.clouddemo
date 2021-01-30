package cloud.ys.demo.config;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ys
 * @date 2021/1/30 10:39
 */

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator paymentroute1(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_atguigu1",
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator paymentport(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder route = routeLocatorBuilder.routes();
        route.route("payment_port_route",
                //需要注意的是path的路径需要与域名后面的路径要相同，不然会报错或404
                r-> r.path("/payment/payment/get/sever")
                        .uri("http://localhost:8081/payment/payment/get/sever")).build();
        return route.build();
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_atguigu",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
