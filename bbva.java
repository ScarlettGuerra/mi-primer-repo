class persona {

    String nombre;
    String sexo;
    int edad;

    persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }
}

class Cliente extends persona {
    int numero;

    Cliente(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
        this.numero = numero;
    }

}

class Banco {
    String nombre;

    Cliente clientes[];

    Banco(int cantidadClientes) {
        clientes = new Cliente[cantidadClientes];
        this.nombre = nombre;
    }

    Cliente crearCliente(String nombre, String sexo, int edad, int numero) {
        System.out.println("Creando cliente...");
        Cliente cliente = new Cliente(nombre, sexo, edad, numero);
        return cliente;
    }
}

class programa {
    public static void main(String[] args) {
        System.out.println("HOLA MUNDO ");
    }
}
