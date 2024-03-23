import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear 20 personas con roles aleatorios
        for (int i = 0; i < 20; i++) {
            String role = getRandomRole();
            int memberId = i + 1;
            char team = (i % 2 == 0) ? 'A' : 'B'; // Alternar entre equipos A y B
            PitCrewTeam person = new PitCrewTeam(role, memberId, team);
        }

        // Menú de opciones
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Realizar ajuste en el ala delantera");
            System.out.println("2. Dar señal para liberar el automóvil");
            System.out.println("3. Realizar cambio de neumáticos");
            System.out.println("4. Realizar ajuste aerodinámico");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el ID del miembro del equipo: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    RaceCar car = new RaceCar("Nombre del piloto", "Necesidades del piloto");
                    PitCrewTeam persona = new PitCrewTeam("Front Wing Man", memberId, 'A');
                    persona.adjustFrontWing(car);
                    break;
                case 2:
                    // Implementación para dar la señal de liberar el automóvil
                    break;
                case 3:
                    // Implementación para realizar cambio de neumáticos
                    break;
                case 4:
                    // Implementación para realizar ajuste aerodinámico
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    // Método para obtener un rol aleatorio
    private static String getRandomRole() {
        String[] roles = {"Tyre Gunner", "Tyre Off", "Tyre On", "Front Wing Man", "Lollipop Man"};
        int randomIndex = (int) (Math.random() * roles.length);
        return roles[randomIndex];
    }
}
