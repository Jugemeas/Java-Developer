
/*EXERCÍCIO 1: Receba 4 notas bimestrais de um aluno. Calcule a média aritmética. Mostre a mensagem de acordo com a média:
    a.	Se a média for >= 6.0                exibir “APROVADO”;
    b.	Se a média for >= 3.0 e < 6.0 exibir “EXAME”;
    c.	Se a média for < 3.0                 exibir “RETIDO”.*/

public class Aluno {
    double nota1, nota2
    public static void main (String arg [ ]) 
   {
    nota1= Integer.parseInt(JOptionPane.showInputDialog ("Digite a primeira nota"));
    nota2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite a segunda nota"));
    Media_Nota();
   }
  
    static void Media_Nota() {
         double media;
	       media = ((double)(num1 + num2) / 2);
           If (media>6.0) {
                System.out.println("APROVADO");
            }
            else {
                If (media<6.0)&&(media>=3.0) {
                    System.out.println("EXAME");
                }
                else{
                    System.out.println("RETIDO");
                }
            }
	}
}

/*EXERCÍCIO 2: Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos,
  sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar em outro.*/

public class Tempo_Jogo {
    int HoraI, MinI, HoraF, MinF;
    public static void main (String arg [ ]) 
   {
    HoraI= Integer.parseInt(JOptionPane.showInputDialog ("Digite a hora inicial"));
    HoraF = Integer.parseInt(JOptionPane.showInputDialog ("Digite a hora final"));
    Hora();
    Minuto();
   }
   static void Hora() {
    int TempoH;
      If (Hora>HoraI) {
        TempoH== HoraF-HoraI;
           System.out.println("Foram jogadas " +TempoH+ "horas.");
       }
       else {
               System.out.println("Foram jogadas " +TempoH+ "horas.");
            }
        }
    static void Minuto() {
        int TempoM;
          If (MinF>MinI) {
            TempoM== MinF-MinI;
            System.out.println("Foram jogadas " +TempoM+ "minutos.");
           }
           else {
            System.out.println("Foram jogadas " +TempoM+ "Minutos.");
           }
   }
}