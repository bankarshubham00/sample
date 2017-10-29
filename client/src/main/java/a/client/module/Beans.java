package a.client.module;

import no.tornado.inject.Eager;
import a.client.HelloClient;

public class Beans {
	@Eager
	HelloClient helloClient() {
		return new HelloClient();
	}
}