class Alumno {
    private int cod_alumno; 
    private String nom_alumno;
    private int ciclo_realtivo;
    private String estado;
}

class Curso {
    private int codigo; 
    private String nombre;
}


class Profesor{
    private int cod_profesor; 
    private String nom_profesor;
}
//clase intermedia
class Horario{ 
    Profesor profesor; 
    Curso curso[];
    public String hora_clase;

    public static void vincular(Profesor profesor, Curso curso, String hora_clase){
        System.out.println("Horario");
        System.out.println(profesor);
        System.out.println(curso);
        System.out.println(hora_clase);
    }
}

class Matricula {
    private int cod_matricula; 
    Alumno alumno; 
    Horario horario[];
    public int creditos_permitidos;     

    public static void matricular(Alumno alumno, Horario horario, int creditos_permitidos){
        int creditos_matriculados = 0;
        for (int i = 0; i < creditos_permitidos; i++) {
        
            System.out.println("Matriculo en " + horario);
        }
          
    }


}



