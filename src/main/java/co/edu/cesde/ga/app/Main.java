package co.edu.cesde.ga.app;

import co.edu.cesde.ga.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Student> students = new ArrayList<>();
    private static Long idCounter = 1L;

    public static void main(String[] args) {
        showMainMenu();
    }

    private static void showMainMenu() {
        int option;

        do {
            System.out.println("\n===== SISTEMA ACADEMICO CESDE 2026 =====");
            System.out.println("1. Gestion de estudiantes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            option = readInt();

            switch (option) {
                case 1 -> showStudentMenu();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion invalida.");
            }
        } while (option != 0);
    }

    private static void showStudentMenu() {
        int option;

        do {
            System.out.println("\n===== SUBMENU ESTUDIANTES =====");
            System.out.println("1. Crear estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar por ID");
            System.out.println("4. Buscar por documento");
            System.out.println("5. Actualizar");
            System.out.println("6. Eliminar");
            System.out.println("7. Total estudiantes");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opcion: ");

            option = readInt();

            switch (option) {
                case 1 -> createStudent();
                case 2 -> listStudents();
                case 3 -> findById();
                case 4 -> findByDocument();
                case 5 -> updateStudent();
                case 6 -> deleteStudent();
                case 7 -> System.out.println("Total: " + students.size());
                case 0 -> System.out.println("Volviendo...");
                default -> System.out.println("Opcion invalida.");
            }
        } while (option != 0);
    }

    private static void createStudent() {
        System.out.println("\n--- Crear estudiante ---");

        String documentType = readRequired("Tipo doc: ");
        String documentNumber = readRequired("Numero doc: ");

        if (existsByDocument(documentNumber)) {
            System.out.println("Ya existe ese documento.");
            return;
        }

        String firstName = readRequired("Nombres: ");
        String lastName = readRequired("Apellidos: ");
        String birthDate = readRequired("Fecha (YYYY-MM-DD): ");
        String status = readRequired("Estado: ");
        Long userId = readOptionalLong("User ID (opcional): ");

        Student student = new Student();
        student.setUserId(idCounter++);
        student.setUserId(userId);
        student.setDocumentType(documentType);
        student.setDocumentNumber(documentNumber);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setBirthDate(birthDate);
        student.setStatus(status);

        students.add(student);

        System.out.println("Estudiante creado:");
        System.out.println(student);
    }

    private static void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No hay estudiantes.");
            return;
        }

        students.forEach(System.out::println);
    }

    private static void findById() {
        Long id = readLong("ID: ");

        if (id == null) {
            System.out.println("ID invalido.");
            return;
        }

        for (Student s : students) {
            if (s.getUserId().equals(id)) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("No encontrado.");
    }

    private static void findByDocument() {
        String doc = readRequired("Documento: ");

        for (Student s : students) {
            if (s.getDocumentNumber().equals(doc)) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("No encontrado.");
    }

    private static void updateStudent() {
        Long id = readLong("ID a actualizar: ");

        if (id == null) {
            System.out.println("ID invalido.");
            return;
        }

        Student student = null;

        for (Student s : students) {
            if (s.getUserId().equals(id)) {
                student = s;
                break;
            }
        }

        if (student == null) {
            System.out.println("No existe.");
            return;
        }

        System.out.println("Enter = mantener valor");

        String name = readOptional("Nombre [" + student.getFirstName() + "]: ");
        if (!name.isBlank()) student.setFirstName(name);

        String last = readOptional("Apellido [" + student.getLastName() + "]: ");
        if (!last.isBlank()) student.setLastName(last);

        String status = readOptional("Estado [" + student.getStatus() + "]: ");
        if (!status.isBlank()) student.setStatus(status);

        System.out.println("Actualizado:");
        System.out.println(student);
    }

    private static void deleteStudent() {
        Long id = readLong("ID a eliminar: ");

        if (id == null) {
            System.out.println("ID invalido.");
            return;
        }

        students.removeIf(s -> s.getUserId().equals(id));

        System.out.println("Eliminado (si existia).");
    }

    private static boolean existsByDocument(String doc) {
        return students.stream().anyMatch(s -> s.getDocumentNumber().equals(doc));
    }

    // ===== INPUT HELPERS =====

    private static int readInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Entrada invalida.");
            return -1;
        }
    }

    private static Long readLong(String msg) {
        System.out.print(msg);
        try {
            return Long.parseLong(scanner.nextLine());
        } catch (Exception e) {
            return null;
        }
    }

    private static String readRequired(String msg) {
        String val;
        do {
            System.out.print(msg);
            val = scanner.nextLine().trim();
        } while (val.isBlank());
        return val;
    }

    private static String readOptional(String msg) {
        System.out.print(msg);
        return scanner.nextLine().trim();
    }

    private static Long readOptionalLong(String msg) {
        System.out.print(msg);
        String val = scanner.nextLine().trim();

        if (val.isBlank()) return null;

        try {
            return Long.parseLong(val);
        } catch (Exception e) {
            System.out.println("Valor invalido.");
            return null;
        }
    }
}