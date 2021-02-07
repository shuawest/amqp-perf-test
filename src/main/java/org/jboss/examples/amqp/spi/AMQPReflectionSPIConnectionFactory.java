package org.jboss.examples.amqp.spi;

import org.apache.activemq.tool.spi.ReflectionSPIConnectionFactory;

public class AMQPReflectionSPIConnectionFactory extends ReflectionSPIConnectionFactory {

  @Override
  public String getClassName() {
    return "org.apache.qpid.jms.JmsConnectionFactory";
  }

}
