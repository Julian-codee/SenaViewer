//Imports Package

import edu.misena.senaviewer.model.movie;
import edu.misena.senaviewer.model.serie;
import edu.misena.senaviewer.model.book;
import edu.misena.senaviewer.model.magazine;
import edu.misena.senaviewer.model.chapter;

//Imports de Usabilidad

import java.util.Date;
import java.util.Scanner;

//Importacion de la informacion Movie, Serie , Book, Magazine, Chapter
public class Main {
    public static void main(String[] args) {
        movie movie = new movie("End Game", "Accion", "Stan Lee", 3, new Date(2006));
        serie serie = new serie("Stranger Things", "Intriga", "Hermanos duffer",2 );

        book book = new book("La Granja del Borrego",new Date(2020), "Nube de Tinta: 001 edición (21 Marzo 2019)");
        //Atributos adicionales
        book.setIsbn("123142");

        magazine magazine = new magazine("Vogue", new Date(2005), " Conde Nast Publications Inc");
        chapter chapter = new chapter("La Casa de papel", 3, new Date(2022));
        Scanner scanner = new Scanner(System.in);

        //Declaraciones de las variables option

        int Choice;
        int Choice1;
        int Choice2;
        int Choice3;
        int Choice4;
        int Choice5;

        //Menu do while Primario
        do {
            String message = "\n\n!--Bienvenido a SenaViewer--¡\n\n";

            message += "1. Movies\n";
            message += "2. Series\n";
            message += "3. Books\n";
            message += "4. Magazines\n";
            message += "5. Chapters\n";
            message += "6. Report\n";
            message += "7. Report Today\n";
            message += "8. Exit...\n\n";

            //Imprime la variable message
            System.out.println(message);

            System.out.println("Elige tu Menu: ");
            Choice = scanner.nextInt();

            //Opciones Switch movie
            switch (Choice) {
                case 1: {
                    String message2 = "\n\n!--Movie--¡\n\n";

                    message2 += "1. Titulo\n";
                    message2 += "2. Genero\n";
                    message2 += "3. Creador\n";
                    message2 += "4. Duración\n";
                    message2 += "5. Año Pelicula\n";
                    message2 += "6. Todas las anteriores...\n\n";

                    System.out.println(message2);
                    System.out.println("Elige tu opcion: ");
                    Choice1 = scanner.nextInt();
                    switch (Choice1) {
                        case 1:
                            System.out.println("El titulo es: " + movie.getTitle());
                            break;
                        case 2:
                            System.out.println("El genero de la pelicula es: " + movie.getGenre());
                            break;
                        case 3:
                            System.out.println("El creador de la pelicula es: " + movie.getCreator());
                            break;
                        case 4:
                            System.out.println("La duracion de la pelicula es: " + movie.getDuration());
                            break;
                        case 5:
                            System.out.println("El año de la pelicula es: " + movie.getYear());
                            break;
                        case 6:
                            System.out.println("El titulo es: " + movie.getTitle() +
                                    "\n El genero de la pelicula es: " + movie.getGenre() +
                                    "\n El creador de la pelicula es: " + movie.getCreator() +
                                    "\n La duracion de la pelicula es: " + movie.getDuration() +
                                    "\n El año de la pelicula es: " + movie.getYear());
                            break;
                        default: {
                            System.out.println("Ingrese una opcion valida...");
                            break;
                        }
                    }
                    break;
                }

                //Opciones Switch serie
                case 2: {
                    String message3 = "\n\n!--Serie--¡\n\n";

                    message3 += "1. Titulo\n";
                    message3 += "2. Genero\n";
                    message3 += "3. Duración\n";
                    message3 += "4. Todas las anteriores...\n\n";

                    //Imprime la variable message
                    System.out.println(message3);

                    System.out.println("Elige tu opcion: ");
                    Choice2 = scanner.nextInt();
                    switch (Choice2) {
                        case 1:
                            System.out.println("El titulo de la serie es: " + serie.getTitle());
                            break;
                        case 2:
                            System.out.println("El genero de la serie es: " + serie.getGenre());
                            break;
                        case 3:
                            System.out.println("la duracion de la serie es: " + serie.getDuration());
                            break;
                        case 4:
                            System.out.println("El titulo de la serie es: " + serie.getTitle() +
                                    "\nEl genero de la serie es: " + serie.getGenre() +
                                    "\nLa duracion de la serie es: " + serie.getDuration());
                            break;
                        default: {
                            System.out.println("Ingrese una opcion valida...");
                            break;
                        }
                    }
                    break;
                }

                //Opciones Switch Book
                case 3: {
                    String message4 = "\n\n!--Book--¡\n\n";

                    message4 += "1. Titulo\n";
                    message4 += "2. Fecha de Edición\n";
                    message4 += "3. Editorial\n";
                    message4 += "4. Isbn\n";
                    message4 += "5. Todas las anteriores...\n\n";

                    //Imprime la variable message
                    System.out.println(message4);

                    System.out.println("Elige tu opcion: ");
                    Choice3 = scanner.nextInt();
                    switch (Choice3) {
                        case 1:
                            System.out.println("El titulo del libro es: " + book.getTitle());
                            break;
                        case 2:
                            System.out.println("La fecha de edición del libro es: " + book.getEditionDate());
                            break;
                        case 3:
                            System.out.println("El editorial del libro es: " + book.getEditorial());
                        case 4:
                            System.out.println("El isbn del libro es: " + book.getIsbn());
                            break;
                        case 5:
                            System.out.println("El titulo del libro es: " + book.getTitle() +
                                    "\nLa fecha de edición del libro es: " + book.getEditionDate() +
                                    "\nEl editorial del libro es: " + book.getEditorial() +
                                    "\nEl isbn del libro es: " + book.getIsbn());
                            break;
                        default: {
                            System.out.println("Ingrese una opcion valida...");
                            break;
                        }
                    }
                    break;
                }

                //Opciones Switch Magazine
                case 4: {
                    String message5 = "\n\n!--Magazine--¡\n\n";

                    message5 += "1. Titulo\n";
                    message5 += "2. Fecha de Edición\n";
                    message5 += "3. Editorial\n";
                    message5 += "4. Todas las anteriores...\n\n";

                    //Imprime la variable message
                    System.out.println(message5);

                    System.out.println("Elige tu opcion: ");
                    Choice4 = scanner.nextInt();
                    switch (Choice4) {
                        case 1:
                            System.out.println("El titulo de la revista es: " + magazine.getTitle());
                            break;
                        case 2:
                            System.out.println("La fecha de edición de la revista es: " + magazine.getEditionDate());
                            break;
                        case 3:
                            System.out.println("El editorial de la revista es: " + magazine.getEditorial());
                        case 4:
                            System.out.println("El titulo de la revista es: " + magazine.getTitle() +
                                    "\nLa fecha de edición de la revista es: " + magazine.getEditionDate() +
                                    "\nEl editorial de la revista es: " + magazine.getEditorial());
                            break;
                        default: {
                            System.out.println("Ingrese una opcion valida...");
                            break;
                        }
                    }
                    break;
                }

                //Opciones Switch Chapter
                case 5: {
                    String message6 = "\n\n!--Chapter--¡\n\n";

                    message6 += "1. Titulo\n";
                    message6 += "2. Duracion\n";
                    message6 += "3. Año Capitulo\n";
                    message6 += "4. Todas las anteriores...\n\n";

                    //Imprime la variable message
                    System.out.println(message6);

                    System.out.println("Elige tu opcion: ");
                    Choice5 = scanner.nextInt();
                    switch (Choice5) {
                        case 1:
                            System.out.println("El titulo del capitulo es: " + chapter.getTitle());
                            break;
                        case 2:
                            System.out.println("La duracion del capitulo es: " + chapter.getDuration());
                            break;
                        case 3:
                            System.out.println("El año del capitulo es: " + chapter.getYear());
                            break;
                        case 4:
                            System.out.println("El titulo del capitulo es: " + chapter.getTitle() +
                                    "\nLa duracion del capitulo es: " + chapter.getDuration() +
                                    "\nEl año del capitulo es: " + chapter.getYear());
                            break;
                        default: {
                            System.out.println("Ingrese una opcion valida...");
                            break;
                        }
                    }
                    break;
                }

                //Opciones Switch Report
                case 6: {
                    String message6 = "\n\n!--Report--¡\n\n";

                    message6 += "1. Titulo\n";
                    message6 += "2. Duracion\n";
                    message6 += "3. Año Capitulo\n";
                    message6 += "4. Todas las anteriores...\n\n";

                    //Imprime la variable message
                    System.out.println(message6);

                    System.out.println("Elige tu opcion: ");
                    Choice5 = scanner.nextInt();
                    switch (Choice5) {
                        case 1:
                            System.out.println("El titulo del capitulo es: " + chapter.getTitle());
                            break;
                        case 2:
                            System.out.println("La duracion del capitulo es: " + chapter.getDuration());
                            break;
                        case 3:
                            System.out.println("El año del capitulo es: " + chapter.getYear());
                            break;
                        case 4:
                            System.out.println("El titulo del capitulo es: " + chapter.getTitle() +
                                    "\nLa duracion del capitulo es: " + chapter.getDuration() +
                                    "\nEl año del capitulo es: " + chapter.getYear());
                            break;
                        default: {
                            System.out.println("Ingrese una opcion valida...");
                            break;
                        }
                    }
                    break;
                }

                //Opciones Switch Report Today
                case 7: {
                    String message6 = "\n\n!--Report Today--¡\n\n";

                    message6 += "1. Titulo\n";
                    message6 += "2. Duracion\n";
                    message6 += "3. Año Capitulo\n";
                    message6 += "4. Todas las anteriores...\n\n";

                    //Imprime la variable message
                    System.out.println(message6);

                    System.out.println("Elige tu opcion: ");
                    Choice5 = scanner.nextInt();
                    switch (Choice5) {
                        case 1:
                            System.out.println("El titulo del capitulo es: " + chapter.getTitle());
                            break;
                        case 2:
                            System.out.println("La duracion del capitulo es: " + chapter.getDuration());
                            break;
                        case 3:
                            System.out.println("El año del capitulo es: " + chapter.getYear());
                            break;
                        case 4:
                            System.out.println("El titulo del capitulo es: " + chapter.getTitle() +
                                    "\nLa duracion del capitulo es: " + chapter.getDuration() +
                                    "\nEl año del capitulo es: " + chapter.getYear());
                            break;
                        default: {
                            System.out.println("Ingrese una opcion valida...");
                            break;
                        }
                    }
                    break;
                }

                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida...");
                    break;
            }

        } while ((Choice != 6));


    }


}