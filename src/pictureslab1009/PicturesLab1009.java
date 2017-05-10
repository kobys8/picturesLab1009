/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pictureslab1009;

/**
 *
 * @author kms080
 */
import gpdraw.*;
import java.awt.Color;
import java.util.Scanner;
public class PicturesLab1009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //multipliTables();
        cipherBill();
        sunBurstSunKist myL = new sunBurstSunKist();
        myL.draw();
    }
    public static void multipliTables() {
        Scanner in = new Scanner(System.in);
        System.out.print("Multiplication Table\nEnter the number of rows: ");
        int rows = in.nextInt();
        while(1 < rows && rows > 12) {
            System.out.print("\nMake sure the value is between 1 and 12, inclusive: ");
            rows = in.nextInt();
        }
        System.out.print("\nEnter the number of columns: ");
        int columns = in.nextInt();
        while(1 < columns && columns > 12) {
            System.out.print("\nMake sure the value is between 1 and 12, inclusive: ");
            columns = in.nextInt();
        }
        for(int i = 1; i < rows + 1; i++) {
            System.out.print(" ");
            System.out.printf("%5s", i);
        }
        System.out.println("\n");
        for(int i = 1; i < columns + 1; i++) {
            System.out.printf("%1d", i);
            for(int j = 1; j < rows + 1; j++) {
                System.out.printf("%5d", i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void cipherBill() {
        Scanner in = new Scanner(System.in);
        System.out.print("Pyramid\nEnter the number of lines: ");
        int lines = in.nextInt();
        for(int i = 1; i <= (lines); i++) {
            for(int j = 1; j <= (lines+1)-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (i*2); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

class sunBurstSunKist {
    private SketchPad myPaper;
    private DrawingTool myPencil;
    public sunBurstSunKist() {
        myPaper = new SketchPad(500,500);
        myPencil = new DrawingTool(myPaper);
    }
    public void draw() {
        for(int i = 0; i <= 360; i++) {
            float i1 = (float)Math.random() * i;
            float i2 = (float)Math.random() * (i * 2);
            float i3 = (float)Math.random() * (i * 3);
            myPencil.setDirection(i);
            myPencil.down();
            myPencil.forward(500);
            myPencil.up();
            myPencil.backward(500);
            myPencil.setColor(Color.getHSBColor(i1, i2, i3));
        }
    }
}
