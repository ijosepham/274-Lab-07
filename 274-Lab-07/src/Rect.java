/**
 * @author Joey Pham
 * @date 17 October 2018
 * @description create a rectangle with an x and y location, along with width and height
 */

public class Rect {
	/**
	 * x value of the rectangle, location
	 */
	private int x;
	/**
	 * y value of the rectangle, location
	 */
	private int y;
	/**
	 * width of the rectangle
	 */
	private int width;
	/**
	 * height of the rectangle
	 */
	private int height;
	
	/**
	 * Constructor - initializes x, y, width, and height
	 */
	public Rect() {
		x = 0;
		y = 0;
		width = 0;
		height = 0;
	}
	
	/**
	 * Constructor - change height and width to desired values if not out of bounds
	 * @param newWidth desired width to change to
	 * @param newHeight desired height to change to
	 */
	public Rect( int newWidth, int newHeight ) {
		if ( newWidth <= 0 ) {
			width = 0;
		} else {
			width = newWidth;
		}
		if ( newHeight <= 0 ) {
			height = 0;
		} else {
			height = newHeight;
		}
		x = 0;
		y = 0;
	}
	
	/**
	 * Constructor - changes all the attributes to the rectangle
	 * @param newX desired x
	 * @param newY desired y
	 * @param newWidth desired width
	 * @param newHeight desired height
	 */
	public Rect( int newX, int newY, int newWidth, int newHeight ) {
		x = newX;
		y = newY;
		if ( newWidth < 0 ) {
			width = 0;
		} else {
			width = newWidth;
		}
		if ( newHeight < 0 ) {
			height = 0;
		} else {
			height = newHeight;
		}
	}
	
	/**
	 * Constructor - create a copy of a rectangle
	 * @param r rectangle to become
	 */
	public Rect( Rect r ) {
		x = r.x;
		y = r.y;
		width = r.width;
		height = r.height;
	}
	
	/**
	 * return the x of the rectangle
	 * @return x value
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * return the y value of the rectangle
	 * @return y value
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * return the width of the rectangle
	 * @return width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * returns the height of the rectangle
	 * @return height
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * compares two rectangles to each other
	 * @return true if they're congruent, false if not
	 */
	@Override
	public boolean equals( Object o ) {
		if( o instanceof Rect ) {
			Rect r = (Rect) o;
			return ( ( this.x == r.x ) && ( this.y == r.y ) && ( this.width == r.width ) && ( this.height == r.height ) );
		}
		return false; // false if they're not the same value
	}
	
	/**
	 * moves the rectangle to the new location
	 * @param newX desired x location
	 * @param newY desired y location
	 */
	public void setLocation( int newX, int newY ) {
		x = newX;
		y = newY;
	}
	
	/**
	 * resizes the rectangle
	 * @param newWidth desired width
	 * @param newHeight desired height
	 */
	public void resize( int newWidth, int newHeight ) {
		if ( newWidth < 0 ) {
		} else {
			width = newWidth;
		}
		if ( newHeight < 0 ) {
		} else {
			height = newHeight;
		}
	}
	
	/**
	 * scale the rectangle by a certain number
	 * @param scaler number you scale the rectangle by
	 */
	public void scale( double scaler ) {
		if ( scaler > 0 ) {
			width *= scaler;
			height *= scaler;
		}
	}
	
	/**
	 * scale the width and height independently
	 * @param widthScaler number to scale the width by
	 * @param heightScaler number to scale the height by
	 */
	public void scale ( double widthScaler, double heightScaler ) {
		if ( widthScaler > 0 ) {
			width *= widthScaler;
		}
		if ( heightScaler > 0 ) {
			height *= heightScaler;
		}
	}
	
	/**
	 * move the rectangle's x and y by a certain number
	 * @param mover number to translate the x and y by
	 */
	public void translate ( int mover ) {
		x += mover;
		y += mover;
	}
	
	/**
	 * move the rectangle's x and y by a certain number independently
	 * @param xMover number to move the x by
	 * @param yMover number to move the y by
	 */
	public void translate( int xMover, double yMover ) {
		x += xMover;
		y += yMover;
	}
	
	/**
	 * find the area of the rectangle
	 * @return the area of the rectangle
	 */
	public int area() {
		return ( width * height );
	}
	
	/**
	 * print out the locatgion, width, and height
	 */
	@Override
	public String toString() {
		return "Loc = (" + x + "," + y + ")  W = " + width + "  H = " + height;
	}
}