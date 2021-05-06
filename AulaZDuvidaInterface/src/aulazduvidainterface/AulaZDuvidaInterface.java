
package aulazduvidainterface;

import corrida.Corrida;
import entidade.Cachorro;
import entidade.Flash;

public class AulaZDuvidaInterface {

    public static void main(String[] args) {
        Flash f = new Flash();
        Cachorro c = new Cachorro();
        
        Corrida.colocaPraCorrer(f);
        Corrida.colocaPraCorrer(c);
    }
    
}
