import java.awt.image.BufferedImage; 
import java.io.File; 
import java.io.IOException; 
import javax.imageio.ImageIO; 
class MirrorImage { 
public static void main(String args[]) throws IOException { 
BufferedImage simg = null; 
File f = null; 
try { 
f = new File("C:\\Users\\Akhila\\OneDrive\\Desktop\\img\\image1.jpg"); 
simg = ImageIO.read(f);
} 
catch (IOException e) { 
System.out.println("Error: " + e); 
} 
int width = simg.getWidth(); 
int height = simg.getHeight(); 
// BufferedImage for mirror image 
BufferedImage mimg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB); 
for (int y = 0; y < height; y++) { 
for (int lx = 0, rx = width - 1; lx < width; lx++, rx--) { 
int p = simg.getRGB(lx, y); 
mimg.setRGB(rx, y, p); 
} 
} 
// save mirror image 
try { 
f = new File("C:\\Users\\Akhila\\OneDrive\\Desktop\\img\\image2.jpg"); 
ImageIO.write(mimg, "png", f); 
} 
catch (IOException e) { 
System.out.println("Error: " + e); 
} 
} 
}