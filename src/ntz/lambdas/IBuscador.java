package ntz.lambdas;

import java.lang.reflect.Type;
import java.util.List;

import db.User;

@FunctionalInterface
public interface IBuscador {

	public User busqueda(List<User> usuarios);
	//public boolean check(boolean bool);
}
