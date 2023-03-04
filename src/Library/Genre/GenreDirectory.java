/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Genre;

import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public class GenreDirectory {
    ArrayList<Genre> genres;
    
    public GenreDirectory(){
        this.genres = new ArrayList<Genre>();
        
    }
    
    public Genre addGenre(String g){
        Genre genre = new Genre(g);
        
        for(Genre gen: this.genres){
            if (!gen.getGenre().equals(g)){
                this.genres.add(genre);
            }
        }

        return genre;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public Genre findGenre(String name) {
        for (Genre gen: this.genres){
            if(gen.getGenre().equals(name)){
                return gen;
            }
        }
        return null;
    }    
    
    
}
