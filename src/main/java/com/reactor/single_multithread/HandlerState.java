package com.reactor.single_multithread;

/**
 * Created by windlike.xu on 2018/6/11.
 */
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ThreadPoolExecutor;

public interface HandlerState {

    public void changeState(TCPHandler h);

    public void handle(TCPHandler h, SelectionKey sk, SocketChannel sc,
                       ThreadPoolExecutor pool) throws IOException ;
}