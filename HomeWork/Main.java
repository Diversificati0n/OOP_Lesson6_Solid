public class Main {
	public static void main(String[] args) {
		User user = new User("Bob");
		user.report();

		DataSaver dataSaver = new Persister();
		dataSaver.save(user);
	}
}



