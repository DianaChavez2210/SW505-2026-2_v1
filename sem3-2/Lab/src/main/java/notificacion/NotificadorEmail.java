package notificacion; 
public class NotificadorEmail implements Notificador{
   @Override
   public void enviar(String destinario, String mensaje){
    System.out.println("Enviando a " + destinario + "Mensaje: " + mensaje);
   } 
}