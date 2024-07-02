/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.ligabetplay.view;

// Importando las clases necesarias
import java.util.Scanner;
import java.text.MessageFormat;
import com.betplay.ligabetplay.model.entity.Usuario;
import com.betplay.ligabetplay.controller.Controlador;
import com.betplay.ligabetplay.model.AlmacenarInfo;
import com.betplay.ligabetplay.controller.errores.ErrIncorrectInputUser;


/**
 *
 * @author mateo
 */
public class viewLogin {
    // Definiendo los atributos necesarios
    private boolean resValCred;
    
    
    // Creando los constructores de la clase
    public viewLogin() {
        
    }
    
    
    // Definiendo los getter y setter para "resValCred"
    public boolean getResValCred() {
        return resValCred;
    }
    public void setResValCred(boolean resValCred) {
        this.resValCred = resValCred;
    }
    
    
    // CREANDO LOS MÉTODOS DE LA CLASE
    // Definiendo la función de inicio según si es inicio o registro
    public void start(int check) {
        // Declarando las variables necesarias
        int numError = 0;
        int numIntentos = 0;
        int rol;
        String idOrigin = "";
        String nombreUserOrigin = "";
        String emailOrigin = "";
        String contraseniaOrigin = "";
        String rolOrigin = "";
        String nombreUsuario;
        String email;
        String emailLogin = "";
        String contrasenia;
        String contraseniaLogin = "";
        String verificarContrasenia;
        
        
        // Definiendo las instancias pertinentes
        Scanner sc = new Scanner(System.in);
        Usuario infoUsuario = new Usuario();
        Controlador controlador = new Controlador();
        AlmacenarInfo infoUser = new AlmacenarInfo();
        
        
        // Efectuando el registro o inicio de sesión de un usuario
        if(check == 1) {
            // Imprimiendo título del menú actual
            System.out.println(" _____      _      _         _   _                      _       ");
            System.out.println("|_   _|    (_)    (_)       | | | |                    (_)      ");
            System.out.println("  | | _ __  _  ___ _  ___   | | | |___ _   _  __ _ _ __ _  ___  ");
            System.out.println("  | || '_ \\| |/ __| |/ _ \\  | | | / __| | | |/ _` | '__| |/ _ \\ ");
            System.out.println(" _| || | | | | (__| | (_) | | |_| \\__ \\ |_| | (_| | |  | | (_) |");
            System.out.println(" \\___/_| |_|_|\\___|_|\\___/   \\___/|___/\\__,_|\\__,_|_|  |_|\\___/ ");
            System.out.println("\n");
            
            
            
            // Pidiendo al usuario el ingreso de un email previamente registrado
            // Bucle para la entrada de correo electrónico en caso de requerir múltiples intentos
            do {
                // Pidiendo al usuario el correo electrónico
                System.out.print("Ingrese un correo electrónico válido: ");
                email = sc.nextLine();

                // Verificando que el email sea correcto
                try {
                    if(controlador.validarEmail(email)) {
                        numError = 0;
                        emailLogin = email;
                        break;

                    } else {
                        throw new ErrIncorrectInputUser(
                            MessageFormat.format(
                                "El correo electrónico '{0}' es inválido.", 
                                email));
                    }

                } catch(ErrIncorrectInputUser e) {
                    // Verificar cuantos errores ha obtenido el usuario
                    if(numError == 3) {
                        System.err.println("\nLímite de intentos alcanzados. Intente de nuevo o hable con un administrador");
                        System.exit(0);

                    } else {
                        numError++;
                        System.out.println("\nVerifique que el email esté registrado e inténtelo de nuevo.");
                        continue;
                    }
                }
            } while(numError <= 3);
            numError = 0;  // Restableciendo el valor de la variable para futuros llamados
            
            
            // Pidiendo al usuario el ingreso de una contraseña establecida para el anterior email
            // Bucle para la entrada de contraseña en caso de requerir múltiples intentos
            do {
                System.out.print("Ingrese su contraseña: ");
                contrasenia = sc.nextLine();

                // PARTE 1 VALIDACIÓN: Validando que la contraseña cumpla con los requerimientos mínimos
                try {
                    if(controlador.validarPassword(contrasenia)) {
                        numError = 0;
                        contraseniaLogin = contrasenia;
                        break;

                    } else {
                        throw new ErrIncorrectInputUser(
                            MessageFormat.format(
                                "La contraseña '{0}' es inválida. Verifique que cumpla con los requerimientos.", 
                                contrasenia));
                    }

                } catch(ErrIncorrectInputUser e) {
                    // Verificar cuantos errores ha obtenido el usuario
                    if(numError == 3) {
                        System.err.println("Límite de intentos alcanzados. Intente de nuevo o hable con un administrador");
                        System.exit(0);

                    } else {
                        numError++;
                        System.out.println("Verifique que la contraseña sea la de la cuenta actual e inténtelo de nuevo.");
                        return;
                    }
                }
            } while(numIntentos <= 10);
            numError = 0;  // Restableciendo el valor de la variable para futuros llamados
            
            
            // Verificando que las credenciales coincidan con algún registro previamente guardado
            boolean resultBool = controlador.validarCredenciales(emailLogin, contraseniaLogin);
            this.resValCred = resultBool;
            
            
            
        } else if(check == 2) {
            // Imprimiendo título del menú actual
            System.out.println("\n");
            System.out.println("______           _     _               _   _                      _       ");
            System.out.println("| ___ \\         (_)   | |             | | | |                    (_)      ");
            System.out.println("| |_/ /___  __ _ _ ___| |_ _ __ ___   | | | |___ _   _  __ _ _ __ _  ___  ");
            System.out.println("|    // _ \\/ _` | / __| __| '__/ _ \\  | | | / __| | | |/ _` | '__| |/ _ \\ ");
            System.out.println("| |\\ \\  __/ (_| | \\__ \\ |_| | | (_) | | |_| \\__ \\ |_| | (_| | |  | | (_) |");
            System.out.println("\\_| \\_\\___|\\__, |_|___/\\__|_|  \\___/   \\___/|___/\\__,_|\\__,_|_|  |_|\\___/ ");
            System.out.println("            __/ |                                                         ");
            System.out.println("           |___/                                                          ");
            System.out.println("\n");
            
            
            
            // Generando un ID único a nivel global para cada usuario
            String id = controlador.generarUUID();
            System.out.println(MessageFormat.format("ID del usuario: {0}", id));
            idOrigin = id;
            
            
            // Pidiendo al usuario su nombre y apellido
            System.out.print("Ingrese al menos un nombre y apellido válido: ");
            nombreUsuario = sc.nextLine();
            // Envía el nombre a la función "validarNombre" y lo establece en la clase Usuario
            String nombreFinal = controlador.validarNombre(nombreUsuario);
            nombreUserOrigin = nombreFinal;
            
            
            
            // Bucle para la entrada de correo electrónico en caso de requerir múltiples intentos
            do {
                // Pidiendo al usuario el correo electrónico
                System.out.print("Ingrese un correo electrónico válido: ");
                email = sc.nextLine();

                // Verificando que el email sea correcto
                try {
                    if(controlador.validarEmail(email)) {
                        numError = 0;
                        emailOrigin = email;
                        break;

                    } else {
                        throw new ErrIncorrectInputUser(
                            MessageFormat.format(
                                "El correo electrónico '{0}' es inválido.", 
                                email));
                    }

                } catch(ErrIncorrectInputUser e) {
                    // Verificar cuantos errores ha obtenido el usuario
                    if(numError == 3) {
                        System.err.println("\nLímite de intentos alcanzados. Intente de nuevo o hable con un administrador");
                        System.exit(0);

                    } else {
                        numError++;
                        System.out.println("\nVerifique que el email sea verídico e inténtelo de nuevo.");
                        continue;
                    }
                }
            } while(numError <= 3);
            numError = 0;  // Restableciendo el valor de la variable para futuros llamados
            
            
            
            // Bucle para la entrada de contraseña en caso de requerir múltiples intentos
            do {
                // Pidiendo al usuario el ingreso de una contraseña de acceso
                System.out.println("\n\n=== CREA TU CONTRASEÑA ===");
                System.out.println(
                    "1. Mínimo 8 dígitos\n" +
                    "2. Letras mayúsculas y minúsculas\n" +
                    "3. Mínimo un número entero\n" +
                    "4. Mínimo un caracter especial"
                );
                System.out.print("Ingrese la contraseña: ");
                contrasenia = sc.nextLine();

                // Validando que la contraseña cumpla con los requerimientos mínimos
                try {
                    if(controlador.validarPassword(contrasenia)) {
                        numError = 0;

                    } else {
                        throw new ErrIncorrectInputUser(
                            MessageFormat.format(
                                "La contraseña '{0}' es inválida. Verifique que cumpla con los requerimientos.", 
                                contrasenia));
                    }

                } catch(ErrIncorrectInputUser e) {
                    // Verificar cuantos errores ha obtenido el usuario
                    if(numError == 3) {
                        System.err.println("Límite de intentos alcanzados. Intente de nuevo o hable con un administrador");
                        System.exit(0);

                    } else {
                        numError++;
                        System.out.println("Verifique que la contraseña sea segura e inténtelo de nuevo.");
                        return;
                    }
                }

                // Confirmando la correcta escritura de la contraseña
                System.out.print("Ingrese de nuevo la contraseña: ");
                verificarContrasenia = sc.nextLine();

                // Verificando que las contraseñas coincidan entre si mismas
                try {
                    if(verificarContrasenia.trim().equals(contrasenia.trim())) {
                        numIntentos = 0;
                        contraseniaOrigin = contrasenia;
                        break;
                        
                    } else {
                        throw new ErrIncorrectInputUser(
                            "Las contraseñas ingresadas no coinciden. Inténtelo de nuevo"
                        );
                    }

                } catch(ErrIncorrectInputUser e) {
                    // Verificar cuantos intentos ha hecho el usuario
                    if(numIntentos == 10) {
                        System.err.println("\nParece que algo ha ido mal al comparar su contraseña. Cree una nueva.");
                        System.exit(0);
                        break;

                    } else {
                        numIntentos++;
                        System.out.println("\nVerifique que ambas contraseñas sean iguales e inténtelo de nuevo.");
                        continue;
                    }
                }
            } while(numIntentos <= 10);
            numIntentos = 0;  // Restableciendo el valor de la variable para futuros llamados
            

            
            // Bucle para la entrada del rol en caso de requerir múltiples intentos
            do {
                // Pidiendo al usuario el ingreso de un rol de usuario
                System.out.println("\n\n=== OPCIONES DE ROL ===");
                System.out.println(
                    "1. Administrador\n" +
                    "2. Entrenador\n" +
                    "3. Jugador\n" +
                    "4. Periodista\n" +
                    "5. Aficionado"
                );
                System.out.print("Ingrese un rol por su número: ");
                rol = sc.nextInt();
                sc.close();
                
                String resValidarRol = controlador.validarRol(rol, numIntentos);
                // Validando que la opción ingresada sea correcta
                if(resValidarRol != "" || resValidarRol != " " || resValidarRol != "Error") {
                    rolOrigin = resValidarRol;
                    break;

                } else {
                    if(numIntentos == 6) {
                        System.err.print("Error: Algo ha ido mal al ingresar su rol. Inténtelo de nuevo más tarde o comuníquese con un administrador.");
                        System.exit(0);
                        break;

                    } else {
                        numIntentos++;
                        System.out.print("La opción ingresada es inválida. Inténtelo de nuevo.");
                        continue;
                    }

                }
                
            } while(numIntentos <= 6);
            
            
            // Agregando toda la información recolectada al constructor:
            AlmacenarInfo setInfoUser = new AlmacenarInfo();
            Usuario user = new Usuario(idOrigin, nombreUserOrigin, emailOrigin, contraseniaOrigin, rolOrigin);
            setInfoUser.setLstUsuario(user);
            
            
            // Mostrando la información guardada 
            System.out.println("\n=== RESUMEN INFORMACIÓN USUARIO ===");
            System.out.println(
                MessageFormat.format(
                    "Id: {0}\nNombre: {1}\nEmail: {2}\nRol: {3}",
                    setInfoUser.getLstUsuario().get(3).getId(),
                    setInfoUser.getLstUsuario().get(3).getNombre(),
                    setInfoUser.getLstUsuario().get(3).getEmail(),
                    setInfoUser.getLstUsuario().get(3).getRolUser()
                )
            );
            
            return;
        }
        
    }
}