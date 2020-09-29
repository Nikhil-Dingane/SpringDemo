package org.kaushik.javabrains;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public void draw() {
		System.out.println("Point A ( " + getPointA().getX() + " , " + getPointA().getY() + " )");
		System.out.println("Point B ( " + getPointB().getX() + " , " + getPointB().getY() + " )");
		System.out.println("Point C ( " + getPointC().getX() + " , " + getPointC().getY() + " )");
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	/*
	 * @Override public void destroy() throws Exception {
	 * System.out.println("DisposableBean destroy method called for Traingle"); }
	 * 
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("InitializationBean init method called for Triangle"); }
	 */
	
	public void myInit() {
		System.out.println("InitializationBean init method called for Triangle");
	}
	
	public void myDestroy() {
		System.out.println("DisposableBean destroy method called for Traingle");
	}
}
