package my.com.myriadeas.ibayar.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class HelloWorldProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		System.out.println("hello world: " + exchange.getIn().getBody());
	}

}
