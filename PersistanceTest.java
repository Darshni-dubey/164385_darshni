package assignment2;

public class PersistanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persistance p = new FilePersistance();
		p.persist();
		Persistance p1 = new DataPersistance();
		p1.persist();
	}

}
