import java.awt.image.BufferedImage;

public class SpriteSheet {
    private BufferedImage image;
    private int width;
    private int height;

    public SpriteSheet(BufferedImage image, int width, int height) {
        this.image = image;
        this.width = width;
        this.height = height;
    }

    public BufferedImage getImage(int col, int row) {
        BufferedImage img = image.getSubimage((col * width) - width, (row * height) - height, width, height);
        return img;
    }
}
