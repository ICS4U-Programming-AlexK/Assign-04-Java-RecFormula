public class RecForm {
    /**
     * The width and length of the rectangle.
     */
    private int width;
    /**
     * The width and length of the rectangle.
     */
    private int length;
    /**
     * The first name of the student.
     * @param widthP
     * The width of the rectangle.
     * @param lengthP
     * The height of the rectangle.
     */
    public RecForm(final int widthP, final int lengthP) {
        this.width = widthP;
        this.length = lengthP;
    }
    /**
     * Returns the area of the rectangle.
     * @return The area of the rectangle.
     */
    public int getArea() {
        return width * length;
    }
    /**
     * Returns the perimeter of the rectangle.
     * @return The perimeter of the rectangle.
     */
    public int getPerimeter() {
        return 2 * (width + length);
    }
    /**
     * Returns the width of the rectangle.
     * @return The width of the rectangle.
     */
    public int getWidth() {
        return width;
    }
    /**
     * Returns the length of the rectangle.
     * @return The length of the rectangle.
     */
    public int getLength() {
        return length;
    }
}
