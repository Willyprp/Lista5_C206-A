
public class Principal {
    public static void main(String[] args) {

        Arquivo arquivo = new Arquivo();
        String[] leitura_csv = new String[4];
        for (String funcionario_arq : arquivo.ler()) {
            leitura_csv  = funcionario_arq.split(",");
            int id = Integer.parseInt(leitura_csv[0]);
            int filhos = Integer.parseInt(leitura_csv[3]);
            double salario = Double.parseDouble(leitura_csv[4]);
            Funcionario aux = new Funcionario(id,filhos,salario);
            if(aux.filhos != 0){
               arquivo.escrever(aux);
           }
        }
}
}
