package a.service.module;

import a.service.impl.HelloServiceImpl;
import a.service.HelloService;
import no.tornado.inject.module.Provides;

public class Beans {
	@Provides(service = HelloService.class)
	HelloService helloService() {
		return new HelloServiceImpl();
	}
}