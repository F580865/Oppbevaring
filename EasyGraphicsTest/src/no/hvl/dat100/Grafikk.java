package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);

	}
	
	public void run() {
		makeWindow("Grafikk", 700, 300);
		drawCircle(150, 70, 60);
		drawCircle(150, 175, 60);
	}

}
