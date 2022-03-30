
public class DatabaseConnexion {
	
	private static DatabaseConnexion instance = null;
	private String dataBase = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String passWord = "root";
	
	private DatabaseConnexion () {
		super();
	}

	public static DatabaseConnexion getInstance() {
		if (DatabaseConnexion.instance == null) {
			DatabaseConnexion.instance = new DatabaseConnexion();
		}
		
		return DatabaseConnexion.instance;
	}
}
