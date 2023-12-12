import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros {
    public static void main(String[] args) {
        // Exemplos de instâncias de carros
        Carro hondaCivic = new Carro("Honda", "Civic");
        Carro rangeRoverEvoque = new Carro("Range Rover", "Evoque");
        Carro bmwSerie3 = new Carro("BMW", "Série 3");

        // Lista de carros
        List<Carro> listaDeCarros = new ArrayList<>();
        listaDeCarros.add(hondaCivic);
        listaDeCarros.add(rangeRoverEvoque);
        listaDeCarros.add(bmwSerie3);

        // Adicionar novos carros à lista
        Carro novoCarro = new Carro("Toyota", "Corolla");
        listaDeCarros.add(novoCarro);

        // Imprimir informações sobre os carros na lista
        for (Carro carro : listaDeCarros) {
            System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo());
        }
    }
}
