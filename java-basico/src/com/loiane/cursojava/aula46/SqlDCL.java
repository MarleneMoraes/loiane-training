package com.loiane.cursojava.aula46;

public interface SqlDCL {
	void grant(String access);
	void revoke(String access);
}
