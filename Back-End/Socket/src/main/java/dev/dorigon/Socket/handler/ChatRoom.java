package dev.dorigon.Socket.handler;

import dev.dorigon.Socket.models.PADOLabsMessage;
import jdk.jfr.Experimental;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatRoom extends AbstractWebSocketHandler {

    public final static List<WebSocketSession> sessionList = Collections.synchronizedList(new ArrayList<>());

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception{
        System.out.println("New session created");
        sessionList.add(session);

        session.sendMessage(new TextMessage("OSDALSDÇSA"));

        super.afterConnectionEstablished(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

        Gson gson = new Gson();
        gson.fromJson(message.getPayload(), PADOLabsMessage.class);

        super.handleTextMessage(session, message);
    }
}
