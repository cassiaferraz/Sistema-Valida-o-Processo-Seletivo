package Candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE ", "MARCIA ", "JULIA ", "PAULO ", "AUGUSTO " };
        for(String candidato: candidatos) {
       }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando =true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
              tentativasRealizadas++;
              else 
                  System.out.println("CONTATO REALIZADO COM SUCESSO");
    
        }while(continuarTentando && tentativasRealizadas<3);
    
        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "TENTATIVA");

        else
            System.out.println("NÃO CONSEGUIMOS CONTANTO COM " + candidato + "NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + "REALIZADA" );
    
    }


    //metodo auxiliar
    static boolean atender() {
    return new Random().nextInt(3)==1;
    }



    static void imprimirCandidatos(){
        String [] candidatos = {"FELIPE ", "MARCIA ", "JULIA ", "PAULO ", "AUGUSTO " };
    System.out.println("Imprimindo a lista de candidatos infrmando o indice do elemento");

        for(int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidados = {"FELIPE ", "MARCIA ", "JULIA ", "PAULO ", "AUGUSTO ", 
        "MONICA ", "FABRICIO ", "MIRELA ", "DANIELA ", "JORGE "};

        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase= 2000.0;
        while(candidatosSelecionados < 5){
            String candidato = candidados[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "solicitou este valor de salário" + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("o candidato " + candidato + "foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }   
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido) 
            System.out.println(" Ligar para o candidato com contra proposta");
        else {
            System.out.println(" Aguardando o resultado dos demais candidatos");
        }
        
    }
}
