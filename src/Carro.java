import java.util.ArrayList;
import java.util.List;

abstract class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método abstrato para obter informações específicas do carro
    public abstract String getInfoEspecifica();
}

class Honda extends Carro {
    public Honda(String modelo) {
        super("Honda", modelo);
    }

    @Override
    public String getInfoEspecifica() {
        return "Informações específicas para Honda";
    }
}

class RangeRover extends Carro {
    public RangeRover(String modelo) {
        super("Range Rover", modelo);
    }

    @Override
    public String getInfoEspecifica() {
        return "Informações específicas para Range Rover";
    }
}

class Lexus570 extends Carro {
    public Lexus570(String modelo) {
        super("Lexus", "570");
    }

    @Override
    public String getInfoEspecifica() {
        return "Informações específicas para Lexus 570";
    }
}

class BMWX7 extends Carro {
    public BMWX7(String modelo) {
        super("BMW", "X7");
    }

    @Override
    public String getInfoEspecifica() {
        return "Informações específicas para BMW X7";
    }
}

