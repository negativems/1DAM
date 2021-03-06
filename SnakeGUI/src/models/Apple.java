package models;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Apple {

	// Cuerpo de la manzana
	private int posX, posY, maxWidth, maxHeight;

	// Creación
	public Apple(int frameWidth, int frameHeight) {
		// creamos la lista de cuadrados.
		this.maxWidth = frameWidth;
		this.maxHeight = frameHeight;
		
		spawn();
	}

	public void spawn() {
		this.posX = (int) ((int) ((Math.random() * ((maxWidth - 100) / 20))) * 20) + 60;
		this.posY = (int) ((int) ((Math.random() * ((maxHeight - 200) / 20))) * 20) + 60;
		
		System.out.println(posX + "," + posY);
	}
	
	public void print(Graphics2D g) {
    	g.setColor(Color.RED);
    	g.fillRect(posX, posY, 20, 20);		
    }
	
    public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setMaxWidth(int maxWidth) {
		this.maxWidth = maxWidth;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

}