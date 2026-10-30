public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("202400001K", "Adam Quispe", 5, 0);
        Docente doc1 = new Docente(1234, "Jose Perez");
        Docente doc2 = new Docente(1234, "Mary Portales");
        Curso cur1 = new Curso(100, "Matematicas I", 3);
        Curso cur2 = new Curso(101, "Matematicas II", 4);
        Curso cur3 = new Curso(102, "Matematicas III", 5);
        Periodo verano20263 = new Periodo(20263, "Verano 2026-3");
        
        // Inscribir a los profesores y cursos
        // doc2 realiza dos cursos
        CursosxCiclo curcic1 = new CursosxCiclo(10, verano20263, doc2, cur1);
        CursosxCiclo curcic2 = new CursosxCiclo(11, verano20263, doc2, cur2);
        // cur2 lo dictan diferentes profesores
        CursosxCiclo curcic3 = new CursosxCiclo(13, verano20263, doc1, cur2);
        
        // Matricula
        Matricula mat1 = new Matricula(20, alumno, verano20263);
        mat1.agregarCurso(curcic1); // se agrega cursos al alumno
        mat1.agregarCurso(curcic3);
        
        System.out.println(alumno);
        //System.out.println(docente);
        //System.out.println(curso);
    }
}