import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros {
    public static void main(String[] args) {
        // Lista de carros
        List<Carro> listaDeCarros = new ArrayList<>();

        // Adicionando carros à lista
        listaDeCarros.add(new Honda("Civic"));
        listaDeCarros.add(new RangeRover("Evoque"));
        listaDeCarros.add(new Lexus570("LX"));
        listaDeCarros.add(new BMWX7("2023"));

        // Imprimir informações sobre os carros na lista
        for (Carro carro : listaDeCarros) {
            System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() +
                    ", " + carro.getInfoEspecifica());
        }
    }
}
