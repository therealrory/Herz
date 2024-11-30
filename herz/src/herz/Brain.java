package herz;


public class Brain {

	public static class SharedTestGameObject {
		public static int x = 0;
		public static int y = 0;
		public static String name = "Gameobject";
		public static String path = "";
	}
	
	public static class GameOptions {
		public static double gravity = 8.91;
		
	}
	
	public static void main(String[] args) {
		// TODO MAKE A ENGINE!!
		System.out.println("Hello World!");
		
		System.out.println(SharedTestGameObject.x);
		System.out.println(SharedTestGameObject.y);
		System.out.println(SharedTestGameObject.name);
		System.out.println(SharedTestGameObject.path);
	}
}
