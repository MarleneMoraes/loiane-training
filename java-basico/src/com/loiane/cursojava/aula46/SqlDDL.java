package com.loiane.cursojava.aula46;

public interface SqlDDL {
	void create(String query);
	void drop(String query);
	void alter(String query);
}
