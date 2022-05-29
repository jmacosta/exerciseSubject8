public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(42);
        persona.setNombre("Juanma");
        persona.setTelefono("954372548");

        System.out.println(persona.getNombre() +" tiene "+ persona.getEdad()+ " años y su télefono es " + persona.getTelefono() );


    }

}

