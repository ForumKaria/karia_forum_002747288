/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import javax.swing.DefaultListSelectionModel;

/**
 *
 * @author forumkaria
 */
public
        class HelloWorld {

    public static
            void main(String[] args) {
        
        String str = "My first assignment";
        int num = 5;
        float numf = 26.2f;
        boolean bool = true;
        char ch = 'm';
        int[] array = new int[4];
        System.out.println("Created array with values: ");
        for (int i = 0; i < 4; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
        
        System.out.println("Created a String with value: " + str);
        System.out.println("Created an int with value: " + num);
        System.out.println("Created a float with value: " + numf);
        System.out.println("Created a char with value: " + ch);
        System.out.println("Created a boolean with value: " + bool);
    }

}
