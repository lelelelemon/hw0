package uchidb;

/**
 * @author aelmore
 */
public class HW0Runner {

	// TODO you likely will need to add member variable

	private static Containers<Integer, String> containers;

	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		if (containers == null) {
			containers = new MapContainers<Integer, String>();
		}
		return containers;
	}

	public static void main(String[] args) {
		// Containers<Integer, String> a = HW0Runner.getContainers();
		// Containers<Integer, String> b = HW0Runner.getContainers();
		// System.out.println(a == b);
	}
}
