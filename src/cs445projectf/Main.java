/**
 * *************************************************************
 * file: Main.java
 * author: M. Lee, N. Li, A. Limjoco
 * class: CS 445 - Computer Graphics
 *
 * assignment: final program
 * date last modified: 10/28/2016
 *
 * purpose: Minecroft
 *
 ***************************************************************
 */
package cs445projectf;

import java.io.*;
import java.util.*;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.input.Keyboard;

public class Main {
    
    public void start() {
        boolean dreams = false;
        while(true) {
            if (dreams == false) {break;} 
            System.out.println("anime is real");
        }
        System.out.println("buhbye dreams");
    }
    
        // method: createWindow
    // purpose: Creates the window for the environment.
    private void createWindow() throws Exception {
        Display.setFullscreen(false);
        Display.setDisplayMode(new DisplayMode(640, 480));
        Display.setTitle("Program #2");
        Display.create();
    }

    // method: initGL
    // purpose: Initializes the matrix for the environment.
    private void initGL() {
        glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(-320, 320, -240, 240, 1, -1);
        glMatrixMode(GL_MODELVIEW);
        glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
    
}
