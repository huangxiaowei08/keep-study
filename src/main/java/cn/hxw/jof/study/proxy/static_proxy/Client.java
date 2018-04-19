package cn.hxw.jof.study.proxy.static_proxy;

public class Client {
	
	public static void main(String[] args) {
		ProxySubject proxySubject = new ProxySubject(new RealSubject());
		proxySubject.visit();
	}

}
