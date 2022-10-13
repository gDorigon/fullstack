package dev.dorigon.Socket.handler;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;
import java.util.Random;

public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor {

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {

        attributes.put("user", getSuperHero());

        return super.beforeHandshake(request, response, wsHandler, attributes);
    }

    protected Object getSuperHero(){

        String[] superheroes = {"Capitão America", "Drake", "Michael Felps", "Narigas", "Sherlock Holmes"};

        Random random = new Random();
        return superheroes[random.nextInt(superheroes.length)];
    }
}
