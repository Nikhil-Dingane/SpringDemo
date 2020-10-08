package org.kaushik.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;


@Component
public class Circle implements Shape {
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: (" + center.getX() + ", " + center.getY() + ")");
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Circle is initialized");
	}
	
	@PreDestroy
	public void destroyeCircle() {
		System.out.println("Circle is destroyed");
	}
}
