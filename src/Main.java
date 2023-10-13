class Main {

    // 1. Modifica las clases Course, Mentor y Student para que utilicen encapusulación.
    // 2. Utiliza una Interfaz para mejorar el diseño orientado a objetos
    // 3. Crea una clase abstracta para mejorar el diseño orientado a objetos

    public static void main(String[] args) {
        Student student = new Student("2070782","Santiago C",6);
        Course course = new Course("Algorithms", "ALGO", 100);
        Course course2 = new Course("Operating Systems", "OSP", 80);
        student.enrroll(course);
        student.enrroll(course2);
        System.out.println(student);
    }

}