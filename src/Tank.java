import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tank {
    private final String spritePath;
    private final int spriteWidth;
    private final int spriteHeight;
    SpriteSheet spriteSheet;

    Animation up;

    Tank() {
        spritePath = "tank.png";
        spriteWidth = 35;
        spriteHeight = 39;

        BufferedImage sprites;
        try {
            sprites = ImageIO.read(new File(spritePath));
        } catch (IOException e) {
            throw new RuntimeException("Error loading image from file " + spritePath);
        }
        spriteSheet = new SpriteSheet(sprites, spriteWidth, spriteHeight);

        up = new Animation(spriteSheet, 4, 1);
    }

    public Image getSprite(int frame) {
        return up.getSprite(frame);
    }
}
