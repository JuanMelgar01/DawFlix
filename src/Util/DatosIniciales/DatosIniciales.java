package Util.DatosIniciales;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Contenido;
import model.Ebook;
import model.Musica;
import model.Pelicula;
import model.Suscripcion;
import model.Usuario;
import model.Contenido.tipoContenido;
import model.Suscripcion.tipoSuscripcion;

public class DatosIniciales {
    public static List<Usuario> cargarUsuarios(){
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan", "Juanito@gmail.com", (new Suscripcion(tipoSuscripcion.PREMIUM, false)), "1234",false));
        usuarios.add(new Usuario("Elena", "Elena@gmail.com", (new Suscripcion(tipoSuscripcion.BASICO, true)), "5678", true));
        return usuarios;
    }

    public static List<Contenido> cargarContenidos(){
        List<Contenido> contenidos = new ArrayList<>();

        contenidos.add(new Pelicula(
            "Inception", "Ciencia ficción", 148, "Un ladrón que roba secretos corporativos a través del uso de la tecnología de sueños.", 
            LocalDate.of(2010, 7, 16), LocalDate.now(), tipoContenido.PREMIUM,16, 
            "Christopher Nolan", 
            new String[] {"Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page"}, 
            new String[] {"Inglés", "Español"}
        ));

        contenidos.add(new Pelicula(
            "The Godfather", "Drama", 175, "La crónica de una familia del crimen organizado en América.", 
            LocalDate.of(1972, 3, 24), LocalDate.now(), tipoContenido.BASICO,18, 
            "Francis Ford Coppola", 
            new String[] {"Marlon Brando", "Al Pacino", "James Caan"}, 
            new String[] {"Inglés", "Italiano"}
        ));

        contenidos.add(new Pelicula(
            "Parasite", "Thriller", 132, "Una familia pobre se infiltra en la vida de una familia rica.", 
            LocalDate.of(2019, 5, 30), LocalDate.now(), tipoContenido.PREMIUM, 13,
            "Bong Joon-ho", 
            new String[] {"Song Kang-ho", "Choi Woo-shik", "Park So-dam"}, 
            new String[] {"Coreano", "Inglés"}
        ));

        contenidos.add(new Pelicula(
            "Interstellar", "Ciencia ficción", 169, "Un equipo de exploradores viaja a través de un agujero de gusano en el espacio.", 
            LocalDate.of(2014, 11, 7), LocalDate.now(), tipoContenido.PREMIUM, 16,
            "Christopher Nolan", 
            new String[] {"Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"}, 
            new String[] {"Inglés", "Español"}
        ));

        contenidos.add(new Pelicula(
            "The Shawshank Redemption", "Drama", 142, "Dos hombres encarcelados desarrollan una amistad que los lleva a la redención.", 
            LocalDate.of(1994, 9, 23), LocalDate.now(), tipoContenido.BASICO, 18,
            "Frank Darabont", 
            new String[] {"Tim Robbins", "Morgan Freeman"}, 
            new String[] {"Inglés", "Español"}
        ));

        contenidos.add(new Pelicula(
            "Spirited Away", "Animación", 125, "Una niña se adentra en un mundo mágico de espíritus y dioses japoneses.", 
            LocalDate.of(2001, 7, 20), LocalDate.now(), tipoContenido.BASICO, 13,
            "Hayao Miyazaki", 
            new String[] {"Rumi Hiiragi", "Miyu Irino"}, 
            new String[] {"Japonés", "Español"}
        ));

        contenidos.add(new Pelicula(
            "Pulp Fiction", "Crimen", 154, "Las historias entrelazadas de criminales de Los Ángeles.", 
            LocalDate.of(1994, 10, 14), LocalDate.now(), tipoContenido.PREMIUM, 18,
            "Quentin Tarantino", 
            new String[] {"John Travolta", "Samuel L. Jackson", "Uma Thurman"}, 
            new String[] {"Inglés", "Francés"}
        ));

        contenidos.add(new Pelicula(
            "Coco", "Animación", 105, "Un joven músico se aventura a la Tierra de los Muertos para encontrar a su tatarabuelo.", 
            LocalDate.of(2017, 10, 20), LocalDate.now(), tipoContenido.BASICO, 0,
            "Lee Unkrich", 
            new String[] {"Anthony Gonzalez", "Gael García Bernal"}, 
            new String[] {"Inglés", "Español"}
        ));

        contenidos.add(new Musica(
            "Bohemian Rhapsody", "Rock", 6, "Una obra maestra de Queen con una estructura poco convencional.", 
            LocalDate.of(1975, 10, 31), LocalDate.now(), tipoContenido.PREMIUM, 0,
            "Queen", "EMI Records"
        ));

        contenidos.add(new Musica(
            "Shape of You", "Pop", 4, "Una pegadiza canción de amor moderna.", 
            LocalDate.of(2017, 1, 6), LocalDate.now(), tipoContenido.BASICO, 0,
            "Ed Sheeran", "Asylum Records"
        ));

        contenidos.add(new Musica(
            "Billie Jean", "Pop", 5, "Una de las canciones más icónicas de Michael Jackson.", 
            LocalDate.of(1983, 1, 2), LocalDate.now(), tipoContenido.PREMIUM, 0,
            "Michael Jackson", "Epic Records"
        ));

        contenidos.add(new Musica(
            "Imagine", "Rock", 3, "Un himno pacifista que invita a soñar con un mundo mejor.", 
            LocalDate.of(1971, 10, 11), LocalDate.now(), tipoContenido.BASICO, 0,
            "John Lennon", "Apple Records"
        ));

        contenidos.add(new Musica(
            "Smells Like Teen Spirit", "Grunge", 5, "La canción que definió a toda una generación en los 90s.", 
            LocalDate.of(1991, 9, 10), LocalDate.now(), tipoContenido.PREMIUM, 0,
            "Nirvana", "DGC Records"
        ));

        contenidos.add(new Musica(
            "Blinding Lights", "Synthwave", 3, "Un tema retrofuturista con vibras de los 80s.", 
            LocalDate.of(2019, 11, 29), LocalDate.now(), tipoContenido.BASICO, 0,
            "The Weeknd", "Republic Records"
        ));

        contenidos.add(new Musica(
            "Hotel California", "Rock", 7, "Una narrativa enigmática sobre el lado oscuro del sueño americano.", 
            LocalDate.of(1977, 2, 22), LocalDate.now(), tipoContenido.PREMIUM, 0,
            "Eagles", "Asylum Records"
        ));

        contenidos.add(new Musica(
            "Bad Guy", "Electropop", 3, "Un enfoque fresco y oscuro sobre la música pop.", 
            LocalDate.of(2019, 3, 29), LocalDate.now(), tipoContenido.BASICO, 0,
            "Billie Eilish", "Interscope Records"
        ));

        contenidos.add(new Ebook(
            "1984", "Ciencia ficción", 720, "Una distopía sobre un futuro totalitario donde todo está vigilado.", 
            LocalDate.of(1949, 6, 8), LocalDate.now(), tipoContenido.PREMIUM, 18,
            "George Orwell", 328
        ));
        
        contenidos.add(new Ebook(
            "Pride and Prejudice", "Romance", 680, "Una crítica social a través de una historia de amor en la Inglaterra georgiana.", 
            LocalDate.of(1813, 1, 28), LocalDate.now(), tipoContenido.BASICO, 13,
            "Jane Austen", 279
        ));
        
        contenidos.add(new Ebook(
            "To Kill a Mockingbird", "Drama", 750, "Una novela sobre la injusticia racial en el sur de Estados Unidos.", 
            LocalDate.of(1960, 7, 11), LocalDate.now(), tipoContenido.PREMIUM, 18,
            "Harper Lee", 324
        ));
        
        contenidos.add(new Ebook(
            "The Hobbit", "Fantasía", 680, "La aventura épica de Bilbo Bolsón a través de la Tierra Media.",
            LocalDate.of(1937, 9, 21), LocalDate.now(), tipoContenido.BASICO, 13,
            "J.R.R. Tolkien", 310
        ));
        
        contenidos.add(new Ebook(
            "The Great Gatsby", "Drama", 600, "Una crítica a la ilusión del sueño americano en los años 20.", 
            LocalDate.of(1925, 4, 10), LocalDate.now(), tipoContenido.BASICO, 18,
            "F. Scott Fitzgerald", 180
        ));
        
        contenidos.add(new Ebook(
            "The Catcher in the Rye", "Drama", 640, "La rebelión adolescente de Holden Caulfield en Nueva York.", 
            LocalDate.of(1951, 7, 16), LocalDate.now(), tipoContenido.PREMIUM, 18,
            "J.D. Salinger", 277
        ));
        
        contenidos.add(new Ebook(
            "The Da Vinci Code", "Thriller", 780, "Un misterioso asesinato en el Louvre lleva a un descubrimiento impactante.", 
            LocalDate.of(2003, 3, 18), LocalDate.now(), tipoContenido.PREMIUM, 16,
            "Dan Brown", 454
        ));
        
        contenidos.add(new Ebook(
            "Harry Potter and the Philosopher's Stone", "Fantasía", 690, "El inicio de la aventura mágica de Harry en Hogwarts.", 
            LocalDate.of(1997, 6, 26), LocalDate.now(), tipoContenido.BASICO, 10,
            "J.K. Rowling", 223
        ));
        
        contenidos.get(0).setPuntuacion(4.8F);
        contenidos.get(1).setPuntuacion(5.0F);
        contenidos.get(2).setPuntuacion(4.6F);
        contenidos.get(3).setPuntuacion(4.7F);
        contenidos.get(4).setPuntuacion(5.0F);
        contenidos.get(5).setPuntuacion(4.9F);
        contenidos.get(6).setPuntuacion(4.5F);
        contenidos.get(7).setPuntuacion(5.0F);
        contenidos.get(8).setPuntuacion(4.2F);
        contenidos.get(9).setPuntuacion(4.9F);
        contenidos.get(10).setPuntuacion(4.8F);
        contenidos.get(11).setPuntuacion(4.7F);
        contenidos.get(12).setPuntuacion(4.5F);
        contenidos.get(13).setPuntuacion(4.9F);
        contenidos.get(14).setPuntuacion(4.3F);
        contenidos.get(15).setPuntuacion(4.9F);
        contenidos.get(16).setPuntuacion(4.7F);
        contenidos.get(17).setPuntuacion(4.8F);
        contenidos.get(18).setPuntuacion(4.8F);
        contenidos.get(19).setPuntuacion(4.6F);
        contenidos.get(20).setPuntuacion(4.2F);
        contenidos.get(21).setPuntuacion(4.4F);
        contenidos.get(22).setPuntuacion(4.9F);
        contenidos.get(23).setPuntuacion(4.8F);

        return contenidos;
    }

}
