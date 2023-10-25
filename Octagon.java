package oop.gruppenuebungFiguren;

import oop.uebungFiguren.Figur;

public class Octagon extends Figur{

	//Instanzvariablen
	double a;
	
	public Octagon (double a)
	{
		setA(a);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getFlaeche()
	{
		return (getA()*getA())*2*(1+Math.sqrt(2));
	}
	public double getUmfang()
	{
		return 8*getA();
	}
}
