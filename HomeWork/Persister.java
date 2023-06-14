public class Persister implements DataSaver {
	public void save(User user) {
		System.out.println("Save user: " + user.getName());
	}
}