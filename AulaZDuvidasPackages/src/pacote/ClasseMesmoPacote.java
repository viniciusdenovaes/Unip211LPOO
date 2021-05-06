package pacote;

public class ClasseMesmoPacote {
    
    void metodo(){
        Classe objeto = new Classe();
        objeto.varPublic = 1;
        objeto.varProtected = 1;
        objeto.varDefault = 1;
        // classe.varPrivate = 1;
        Classe.varStatic = 1;
    }
    
}
