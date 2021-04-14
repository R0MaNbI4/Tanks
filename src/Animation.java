import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Animation {
    private List<BufferedImage> animation;

    Animation(SpriteSheet spriteSheet, int frames, int row) {
        animation = new ArrayList<>();

        for (int i = 1; i <= frames; i++) {
            animation.add(spriteSheet.getImage(i, row));
        }
    }

    public Image getSprite(int frame) {
        return animation.get(frame);
    }
}
