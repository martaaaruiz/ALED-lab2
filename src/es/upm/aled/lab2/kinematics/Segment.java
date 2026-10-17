package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;

// TODO: Implemente la clase
/**
 * En esta clase representamos los segmentos de un exoesqueleto
 * @author Usuario
 */
public class Segment {
	private double length;
	private double angle;
	private List<Segment> children;
	
	/**
	 * Constructor de un segmento a partir de su longitud y su angulo 
	 * @param length
	 * Tamaño del segmento
	 * @param angle
	 * Angulo que deja con respecto a su segmento padre 
	 */
	public Segment(double length, double angle) {
		this.length = length;
		this.angle = angle;
		this.children = new ArrayList<Segment>();
	}
	
	/**
	 * @return devuelve el angulo del segmento 
	 */
	public double getAngle() {
		return angle;
	}
	/**
	 * @param devuelve el angulo del segmento 
	 */
	public void setAngle(double angle) {
		this.angle = angle;
	}
	/**
	 * @return devuelve la longitud del segmento 
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @return Lista con todos los segmentos hijos
	 */
	public List<Segment> getChildren() {
		return children;
	}
	/**
	 * @param child añade chil a la lista si no esta ya 
	 */
	public void addChild(Segment child) {
		if(!children.contains(child))
			children.add(child);
		
	}
}
