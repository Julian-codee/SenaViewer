import edu.misena.senaviewer.model.movie;
import edu.misena.senaviewer.model.serie;
import edu.misena.senaviewer.model.book;
import edu.misena.senaviewer.model.magazine;

import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        movie movie = new movie("Spider-Man", "Accion", "Stan Lee", 3, new Date(2006) );
        serie serie = new serie("Soy leyenda", "Accion", 2);
        book book= new book("A dos metros de ti", new Date(2010), "Nube de Tinta: 001 edición (21 Marzo 2019)", "841760502");
        magazine magazine = new magazine("Vogue",  new Date(2005), " Conde Nast Publications Inc");
        Scanner scanner = new Scanner(System.in);

        //Declaraciones de las variables

        int option;
        int option2;
        int option3;
        int option4;
        int option5;

        do {String message = "\n\n!--Bienvenido a SenaViewed--¡\n\n";

            message += "1. Book\n";
            message += "2. Chapter\n";
            message += "3. Movie\n";
            message += "4. Serie\n";
            message += "5. Magazine\n";
            message += "6. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu Menu: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    do {System.out.println("1)Titulo \n2)Genero  \n3)Creador \n4)Duracion  \n5)Pelicula \n6)Todas las opciones");
                        option2 = scanner.nextInt();
                        switch (option2) {
                            case 1:
                                System.out.println("El titulo es: "+ movie.getTitle());
                                break;
                            case 2:
                                System.out.println("El genero de la pelicula es: "+movie.getGenre());
                                break;
                            case 3:
                                System.out.println("El creador de la pelicula es: "+ movie.getCreator());
                                break;
                            case 4:
                                System.out.println("La duracion de la pelicula es: "+movie.getDuration());
                                break;
                            case 5:
                                System.out.println("El año de la pelicula es: "+movie.getYear());
                                break;
                            case 6:
                                System.out.println("El titulo es: "+movie.getTitle()+
                                        "\n El genero de la pelicula es: "+movie.getGenre()+
                                        "\n El creador de la pelicula es: "+ movie.getCreator()+
                                        "\n La duracion de la pelicula es: "+movie.getDuration()+
                                        "\n El año de la pelicula es: "+movie.getYear());
                                break;
                        }
                        break;
                    }while ( (option2 !=6));

                case 2:
                    do {System.out.println("1)Titulo \n2)Genero  \n3)Duracion  \n4)Todas las opciones");
                        option3 = scanner.nextInt();
                        switch (option3) {
                            case 1:
                                System.out.println("El titulo de la pelicula es: "+serie.getTitle());
                                break;
                            case 2:
                                System.out.println("El genero de la pelicula es: "+serie.getGenre());
                                break;
                            case 3:
                                System.out.println("El titulo de la pelicula es: "+serie.getTitle()+
                                        "\nEl genero de la pelicula es: "+serie.getGenre()+
                                        "\nLa duracion de la pelicula es: "+serie.getDuration());
                                break;
                        }
                        break;
                    }while ( (option3 !=7));

                case 3:
                    do {System.out.println("1)Titulo \n2)Fecha de edicion  \n3)Editorial \n4)Isbn  \n5)Todas las opciones");
                        option4 = scanner.nextInt();
                        switch (option4) {
                            case 1:
                                System.out.println("El titulo del libro es: "+ book.getTitle());
                                break;
                            case 2:
                                System.out.println("La fecha de edición del libro es: "+ book.getEditionDate());
                                break;
                            case 3:
                                System.out.println("El editorial del libro es: "+ book.getEditorial());
                            case 4:
                                System.out.println("El isbn del libro es: "+ book.getIsbn());
                                break;
                            case 5:
                                System.out.println("El titulo del libro es: "+ book.getTitle()+
                                        "\nLa fecha de edición del libro es: "+ book.getEditionDate()+
                                        "\nEl editorial del libro es: "+ book.getEditorial()+
                                        "\nEl isbn del libro es: "+ book.getIsbn());
                                break;
                        }
                        break;
                    }while ( (option4 !=7));

                case 4:
                    do {System.out.println("1)Titulo \n2)Fecha de edicion  \n3)Editorial \n4)Todas las opciones");
                        option5 = scanner.nextInt();
                        switch (option5) {
                            case 1:
                                System.out.println("El titulo de la revista es: "+magazine.getTitle());
                                break;
                            case 2:
                                System.out.println("La fecha de edición de la revista es: "+magazine.getEditionDate());
                                break;
                            case 3:
                                System.out.println("El editorial de la revista es: "+ magazine.getEditorial());
                            case 4:
                                System.out.println("El titulo de la revista es: "+magazine.getTitle()+
                                        "\nLa fecha de edición de la revista es: "+magazine.getEditionDate()+
                                        "\nEl editorial de la revista es: "+magazine.getEditorial());
                                break;
                        }
                        break;
                    }while ( (option5 !=7));

                case 5:
                    do {System.out.println("1)Titulo \n2)Fecha de edicion  \n3)Editorial \n4)Todas las opciones");
                        option5 = scanner.nextInt();
                        switch (option5) {
                            case 1:
                                System.out.println("El titulo de la revista es: "+magazine.getTitle());
                                break;
                            case 2:
                                System.out.println("La fecha de edición de la revista es: "+magazine.getEditionDate());
                                break;
                            case 3:
                                System.out.println("El editorial de la revista es: "+ magazine.getEditorial());
                            case 4:
                                System.out.println("El titulo de la revista es: "+magazine.getTitle()+
                                        "\nLa fecha de edición de la revista es: "+magazine.getEditionDate()+
                                        "\nEl editorial de la revista es: "+magazine.getEditorial());
                                break;
                        }
                        break;
                    }while ( (option5 !=7));

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida...");
                    break;
            }

        }while ( (option !=6));


    }


}