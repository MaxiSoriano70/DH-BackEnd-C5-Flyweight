package flyweight.service;

import flyweight.model.Arbol;
import flyweight.model.ETipoArbol;

import java.util.HashMap;

public class ArbolFactory {
    private static HashMap<ETipoArbol, Arbol> poolArboles = new HashMap<>();

    public static Arbol obtenerArbol(ETipoArbol tipoArbol){
        Arbol arbol = poolArboles.get(tipoArbol);
        if(arbol == null){
            switch (tipoArbol){
                case ORNAMENTALES:{
                    arbol = new Arbol(200,400,"Verde",ETipoArbol.ORNAMENTALES);
                    break;
                }
                case FRUTALES:{
                    arbol = new Arbol(500,300,"Rojo",ETipoArbol.FRUTALES);
                    break;
                }
                case FLORALES:{
                    arbol = new Arbol(100,200,"Celeste",ETipoArbol.FLORALES);
                    break;
                }
                default:
                    System.out.println("No existe ese tipo de arbol");
            }
            System.out.println("Arbol creado con EXITO: "+ arbol);
            poolArboles.put(tipoArbol, arbol);
        }
        else {
            System.out.println("Arbol encontrado: "+ arbol);
        }
        return arbol;
    }
}
