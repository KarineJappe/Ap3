package Aula11;

public class Bomba {
    /* Faça uma classe que simule o funcionamento de uma bomba d ́água. A bomba possui um atributo booleano chamado
   “status” e os métodos “ligar” e “desligar” (ambos sem retorno). O método “ligar” coloca true em “status” e o
    método “desligar” coloca false em status. A bomba deve  ficar ligada durante um certo intervalo de tempo (em segundos).
    O tempo em segundos deve ser recebido pelo método ligar. A cada segundo, apresente em tela quantos segundos faltam para
    a bomba ser desligada. Decorrido o tempo, o método desligar é acionado e a bomba é desligada. Crie uma classe chamada
    UsaBomba que utilize a classe do Bomba. Ela deve conter o método main e:
    a) instanciar uma bomba (bomba1);
    b) ligar o objeto bomba1 durante 5 segundos;
*/

       public boolean status;

       public void ligar(int segundos ){
            status = true;
           System.out.println("Bomba Ligada");
           for (int i=0;i<segundos;i++){
               System.out.println("Falta " +(segundos-i)+ " segundos pra desligar a bomba");
               try {
                   Thread.sleep(segundos*1000);//pausa
               }catch (Exception ie){
                   System.out.println("Deu pau");
               }
           }
           desligar();
       }
       public void desligar(){
           status = false;
           System.out.println("Bomba desligada");
    }
}
