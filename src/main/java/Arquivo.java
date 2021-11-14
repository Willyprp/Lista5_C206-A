import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Funcionario funcionario){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try{
            os = new FileOutputStream("Func_filtrado.csv", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write(funcionario.id + ",");
            bw.write(funcionario.filhos + ",");
            bw.write(funcionario.salario + "\n");

        }catch (Exception e){
            System.out.println(e);

        }finally {
            try{
                bw.close();

            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public ArrayList<String> ler(){
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String lerLinha;
        ArrayList<String> leitura = new ArrayList<>();

        try{
            is = new FileInputStream("funcionarios.csv");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            lerLinha = br.readLine();
            while(lerLinha != null){
                if(!lerLinha.contains("Iden"))
                    leitura.add(lerLinha);
                lerLinha = br.readLine();
            }

        }catch (Exception e){
            System.out.println(e);

        }finally {
            try {
                br.close();

            }catch (Exception e){
                System.out.println(e);

            }
        }

        return leitura;
    }
}