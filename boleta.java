import java.util.Scanner;

public class boleta {
    

        public static void main(String[] args) {
    
            try (// Instanciamos un objeto de la clase Scanner para leer la entrada del usuario.
            Scanner scanner = new Scanner(System.in)) {
   
                // Solicitamos al usuario que ingrese el nombre del alumno.
                System.out.println("Ingrese el nombre del alumno: ");
                String nombreAlumno = scanner.nextLine();

                 // Solicitamos al usuario que ingrese el número de control del alumno.
                System.out.println("Ingrese el número de control del alumno: ");
                int numeroControl = scanner.nextInt();
   
                // Solicitamos al usuario que ingrese el semestre.
                System.out.println("Ingrese el semestre: ");
                int semestre = scanner.nextInt();
   
                // Solicitamos al usuario que ingrese la calificación del parcial 1.
                System.out.println("Ingrese la calificación del parcial 1: ");
                int calificacionParcial1 = scanner.nextInt();
   
                // Solicitamos al usuario que ingrese la calificación del parcial 2.
                System.out.println("Ingrese la calificación del parcial 2: ");
                int calificacionParcial2 = scanner.nextInt();
   
                // Solicitamos al usuario que ingrese la calificación del parcial 3.
                System.out.println("Ingrese la calificación del parcial 3: ");
                int calificacionParcial3 = scanner.nextInt();
   
                // Creamos un objeto de la clase Alumno.
                Alumno alumno = new Alumno(numeroControl, nombreAlumno, semestre);
   
                // Creamos un objeto de la clase Materia.
                materia materia = new materia();
   
                // Calculamos el promedio del alumno.
                int promedio = (int) (calificacionParcial1 + calificacionParcial2 + calificacionParcial3) / 3;
                materia.setPromedio(promedio);
   
                // Mostramos la boleta del alumno.
                System.out.println("Boleta de calificaciones");
                System.out.println("Número de control: " + alumno.getNumeroControl());
                System.out.println("Nombre del alumno: " + alumno.getNombreAlumno());
                System.out.println("Semestre: " + alumno.getSemestre());
                System.out.println("Promedio: " + materia.getPromedio());
            }
        }
    
    }





