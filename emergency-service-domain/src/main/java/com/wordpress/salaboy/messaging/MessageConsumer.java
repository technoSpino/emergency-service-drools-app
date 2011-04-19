/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.salaboy.messaging;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hornetq.api.core.HornetQException;
import org.hornetq.api.core.TransportConfiguration;
import org.hornetq.api.core.client.ClientConsumer;
import org.hornetq.api.core.client.ClientMessage;
import org.hornetq.api.core.client.ClientSession;
import org.hornetq.api.core.client.ClientSessionFactory;
import org.hornetq.api.core.client.HornetQClient;
import org.hornetq.integration.transports.netty.TransportConstants;

/**
 *
 * @author salaboy
 */
public class MessageConsumer {
    private ClientSession consumerSession;
    private ClientConsumer consumer;
    private String queueName;
    public MessageConsumer(String queueName) {
        this.queueName = queueName;
        try {
            Map<String, Object> connectionParams = new HashMap<String, Object>();
            connectionParams.put(TransportConstants.PORT_PROP_NAME, 5446);
            TransportConfiguration transportConfiguration = new TransportConfiguration("org.hornetq.integration.transports.netty.NettyConnectorFactory", connectionParams);
            ClientSessionFactory factory = HornetQClient.createClientSessionFactory(transportConfiguration);
            consumerSession = factory.createSession();
            consumerSession.createQueue(queueName, queueName, true);
            consumer = consumerSession.createConsumer(queueName);
            consumerSession.start();
        } catch (HornetQException ex) {
            Logger.getLogger(MessageConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getQueueName() {
        return queueName;
    }
    
    public Object receiveMessage() throws HornetQException {
        ClientMessage msgReceived = consumer.receive();
        //@TODO: write object reader form bytes -> msgReceived.getBodyBuffer().readByte();
        return msgReceived.getBodyBuffer().readString();
    }

    public void stop() throws HornetQException {
        consumer.close();
        consumerSession.stop();
    }
    
    

}