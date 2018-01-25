package comp557.a1;

import javax.vecmath.Vector3d;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import mintools.parameters.DoubleParameter;

public class Cube extends DAGNode {
	
	DoubleParameter tx;
	DoubleParameter ty;
	DoubleParameter tz;
	DoubleParameter rx;
	DoubleParameter ry;
	DoubleParameter rz;
	DoubleParameter sx;
	DoubleParameter sy;
	DoubleParameter sz;

	
	public Cube(String name){
		super(name);
		dofs.add( tx = new DoubleParameter( name+" tx", 0, -2, 2 ) );		
		dofs.add( ty = new DoubleParameter( name+" ty", 0, -2, 2 ) );
		dofs.add( tz = new DoubleParameter( name+" tz", 0, -2, 2 ) );
		dofs.add( rx = new DoubleParameter( name+" rx", 0, -180, 180 ) );		
		dofs.add( ry = new DoubleParameter( name+" ry", 0, -180, 180 ) );
		dofs.add( rz = new DoubleParameter( name+" rz", 0, -180, 180 ) );
		dofs.add( sx = new DoubleParameter( name+" sx", 5, 1, 10 ) );		
		dofs.add( sy = new DoubleParameter( name+" sy", 5, 1, 10 ) );
		dofs.add( sz = new DoubleParameter( name+" sz", 5, 1, 10 ) );
		
		
	}
	
	@Override
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		
		gl.glPushMatrix();
		
		gl.glTranslated(tx.getValue(), ty.getValue(), tz.getValue());
		gl.glRotated(rx.getValue(), 1, 0, 0);
		gl.glRotated(ry.getValue(), 0, 1, 0);
		gl.glRotated(rz.getValue(), 0, 0, 1);
		
		gl.glScaled(sx.getValue(), sy.getValue(), sz.getValue());
		
		
		glut.glutSolidCube(1);
		
		super.display(drawable);
		
		gl.glPopMatrix();
	
	}
	
}
