package com.vincentramdhanie.snake;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * A segment of a snake. A collection of Segments
 * make up the body of the snake.
 * @author vramdhanie@gmail.com (Vincent Ramdhanie)
 */
public class Segment {

	public static final int SEGMENT_WIDTH = 10;
	public static final int SEGMENT_HEIGHT = 3;
	public static final int SEGMENT_INITIAL_X = 50;
	public static final int SEGMENT_INITIAL_Y = 100;

	Shape shape;
	List<AffineTransform> transforms;

	public Segment(){
		shape = new Rectangle2D.Double(SEGMENT_INITIAL_X, SEGMENT_INITIAL_Y, SEGMENT_WIDTH, SEGMENT_HEIGHT);
		transforms = new ArrayList<AffineTransform>();
	}

	public void addTransform(AffineTransform af){
		transforms.add(af);
	}

	public void draw(Graphics2D g){
		g.setColor(Color.GREEN);
		//System.out.println(getShape().getBounds2D().getX());
		if(!transforms.isEmpty()){
			
			shape = transforms.get(0).createTransformedShape(shape);
			transforms.remove(0);
		}
		
		g.fill(shape);
			
	}

	public Shape getShape(){
		return shape;
	}


}
