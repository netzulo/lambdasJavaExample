package ntz;

import java.util.ArrayList;
import java.util.List;

import db.User;
import db.exceptions.UserException;
import ntz.lambdas.IBuscador;

public class Main {
	
	private static List<User> usuarios = new ArrayList<>();
	private static List<User> usersSelected = new ArrayList<>();;
	private static User userSelectedById = null;
	
	
	private static IBuscador userByFirstPos = (List<User> users) -> {
		return users.get(0);};
	private static IBuscador userById3AddToList = (List<User> users) -> {			 			
		//Añade un usuario con id 3 a una lista y lo devuelve desde la lista en la que se ha insertado
		users.forEach((n)-> usersSelected.add(n.getId()== 3? n: null ));
		return usersSelected.get(0);			
	};		
	private static IBuscador userById3 = (List<User> users) -> {
		//Selecciona el usuario con id = 3
		users.forEach((m)-> 
			{
				if(m.getId() == 3){
					userSelectedById = m;
				}
			}
		);		
		return userSelectedById;
	};	
	private static IBuscador userByLastPos = (List<User> users) -> {
		int userPos = users.size() - 1;			
		return users.get(userPos);
	};
	
	public static void main(String[] args) throws UserException {
	
		//Test data - load 5 defined users
		loadTestData(); 
						
		User[] usersSelected = new User[4];
		//Busca el primer usuario de una lista de usuarios
		usersSelected[0] = userByFirstPos.busqueda(usuarios);
		//Busca un user con id = 3 y lo añade como ultimo 
		usersSelected[1] = userById3AddToList.busqueda(usuarios);
		usersSelected[2] = userById3.busqueda(usuarios);		
		usersSelected[3] = userByLastPos.busqueda(usuarios);
		
		for (int i = 0; i < usersSelected.length; i++) {
			try {
				System.out.println(usersSelected[i].toString());
			} catch (Exception e) {
				System.out.println("null user");
			}
		}//for
	}

	private static void loadTestData() {
		try {			
			usuarios.add(new User(1,"pablo","pass","test@mail.com"));
			usuarios.add(new User(2,"pedro","pass","test@mail.com"));
			usuarios.add(new User(3,"eustaquio","pass","test@mail.com"));
			usuarios.add(new User(4,"teodoro","pass","test@mail.com"));
			usuarios.add(new User(5,"rodolfo","pass","test@mail.com"));			
		} catch (UserException e) {	e.printStackTrace();}
	}
}
