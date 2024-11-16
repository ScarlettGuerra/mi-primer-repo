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

    Cliente(String nombre, String sexo, int edad, int numero) {
        super(nombre, sexo, edad);
        this.numero = numero;
    }

}

class Banco {
    String nombre;

    Cliente clientes[];

    Banco(int cantidadClientes, String nombre) {
        clientes = new Cliente[cantidadClientes];
        this.nombre = nombre;
    }

    Cliente crearCliente(String nombre, String sexo, int edad, int numero) {
        System.out.println("Creando cliente...");
        Cliente cliente = new Cliente(nombre, sexo, edad, numero);

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                System.out.println("CLIENTE CREADO EXITOSAMENTE");
                break;
            }
        }
        return cliente;
    }

    void listarClientes() {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                Cliente cliente = clientes[i];
                System.out.println("cliente" + cliente.nombre + "No." + cliente.numero);
            }
        }
    }
}

class cuenta {
    double saldo;

    cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    void cargar(double cantidad) {
        saldo = saldo - cantidad;

    }

    void abonar(double cantidad) {
        saldo = saldo * cantidad;
    }

    class Cliente extends persona {
        int numero;
        cuenta Cuenta;

        Cliente(int numero, String sexo, int edad, String nombre) {
            super(nombre, sexo, edad);
            this.numero = numero;
        }

        void asociarCuenta(cuenta Cuenta) {
            this.Cuenta = Cuenta;
        }
    }
}

class programa {
    public static void main(String[] args) {
        System.out.println("welcome to the bank ");
        Banco banco = new Banco(5, "BBVA");
        banco.crearCliente("pepe", "hombre", 21, 12345);
        banco.crearCliente("juan", "hombre", 25, 12346);
        banco.listarClientes();
    }
}
