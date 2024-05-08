import flyweight.model.Arbol;
import flyweight.model.ETipoArbol;
import flyweight.service.ArbolFactory;

public class Main {
    /*public static ETipoArbol tipoArbolAleatorio() {
        ETipoArbol[] tipoArbols = {ETipoArbol.ORNAMENTALES, ETipoArbol.FRUTALES, ETipoArbol.FLORALES};
        return tipoArbols[(int)(Math.random()*tipoArbols.length)];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++){
            Arbol arbol = ArbolFactory.obtenerArbol(tipoArbolAleatorio());
        }
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }*/

    public static void main(String[] args) {
        int contador = 0;
        while (contador < 100){
            if(contador >= 0 && contador< 50){
                Arbol arbol = ArbolFactory.obtenerArbol(ETipoArbol.FRUTALES);
            }
            if(contador >= 50 && contador < 100){
                Arbol arbol = ArbolFactory.obtenerArbol(ETipoArbol.ORNAMENTALES);
            }
            contador++;
        }
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}