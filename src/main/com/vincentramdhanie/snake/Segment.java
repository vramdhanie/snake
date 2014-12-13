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
	Shape shape;
	List<AffineTransform> transforms;

	public Segment(){
		shape = new Rectangle2D.Double(50, 100, 10, 3);
		transforms = new ArrayList<AffineTransform>();
	}

	public void addTransform(AffineTransform af){
		transforms.add(af);
	}

	public void draw(Graphics2D g){
		g.setColor(Color.GREEN);
		
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
