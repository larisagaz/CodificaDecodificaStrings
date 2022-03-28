package Codificadores;

public class Codifica21180470 implements Codifica{

    @Override
    public String getNomeAutor(){
        return "Larissa Sagaz";
    }

    @Override
    public String getMatriculaAutor(){
        return "21180470";
    }

    @Override
    public String codifica(String frase){
        StringBuilder codificada = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            codificada.append(c);
        }
        return codificada.toString();
    }
    

    @Override
    public String decodifica(String frase){
        StringBuilder decodificada = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            decodificada.append(c);
        }
        return decodificada.toString();
    }
}