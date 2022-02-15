package ga.mmbh.cfgs.pokedexdb.managers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ga.mmbh.cfgs.pokedexdb.dao.UserDAO;
import ga.mmbh.cfgs.pokedexdb.models.User;

public class UserManager {

	private final UserDAO userDAO;
	private List<User> usersList = new ArrayList<>();
	private User session;
	
	public UserManager() {
		this.userDAO = new UserDAO();
	}
	
	public boolean login(String username, String password) {
		if (!exists(username, password)) return false;
		session = new User(username, password);
		return true;
	}
	
	public boolean registerUser(User user) {
		String[] values = new String[] {
				user.getUsername(),
				user.getPassword()
		};
		
		return userDAO.insertOne("Username, Password", values);
	}
	
	public boolean exists(String username, String password) {
		try {
			return userDAO.getFirst("*", "Username = '" + username + "' " + (password != null ? " AND Password = '" + password + "'": "")).next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean exists(String username) {
		return exists(username, null);
	}
	
	// Getters & Setters
	public List<User> getUsers() {
		return usersList;
	}
	
}