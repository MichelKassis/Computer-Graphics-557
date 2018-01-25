package comp557.a1;

import com.jogamp.opengl.GLAutoDrawable;

public class CharacterCreator {

	static public String name = "Happy - Michel Kassis AND 260662779";
	
	/** 
	 * Creates a character.
	 * @return root DAGNode
	 */
	static public DAGNode create() {
		// TODO: use for testing, and ultimately for creating a character
		// Here we just return null, which will not be very interesting, so write
		// some code to create a charcter and return the root node.
				
		FreeJoint root = new FreeJoint("Root");
		HingeJoint hinge = new HingeJoint("Hinge" , 0, 90) ;
		BallJoint ball = new BallJoint("Ball" , 0, 360) ;
		Cube cube = new Cube( "" + "Cube");
		
		
		root.add(hinge);
		
		root.add(ball);
		root.add(cube);
		
		return root;
	}
}
