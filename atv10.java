//Faça um programa de implemente um jogo de Craps. 
//O jogador lança um par de dados, obtendo um valor entre 2 e 12.
// Se, na primeira jogada, você tirar 7 ou 11, você um "natural" e ganhou. 

// Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "craps" e você perdeu.
//  Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". 
  //Seu objetivo agora é continuar jogando os dados até tirar este número novamente. 
//Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente.
//import java.util.Scanner;
public class atv10 {

  public static void main(String[] args) {
     System.out.println("Bem vindo ao jogo");
     System.out.println("Iniciando....");
     System.out.println("Jogando os dados...");
     int dado1 = 1 + (int)(Math.random()*5);
     int dado2 = 1 + (int)(Math.random()*5);
     int somadados = dado1+dado2;
     int somadados2;
     if (somadados==7||somadados==11){
      System.out.println("A soma dos dados foi"+somadados);
      System.out.println("Voce ganhou!!!");
    
     }
     if(somadados==2||somadados==3||somadados==12){
      System.out.println("A soma dos dados foi"+somadados);
      System.out.println("SCRAP, voce perdeu!!!");
     }
     if (somadados==4||somadados==5||somadados==6||somadados==8||somadados==9||somadados==10){
      do {
        int dados11 =1 + (int)(Math.random()*6);
        int dados21= 1 + (int)(Math.random()*6);
        somadados2=dados11+dados21;
        System.out.println("A soma dos dados inicias é "+somadados);
        System.out.println("A soma dos dados é" +somadados2);
         
        if (somadados2==7){
          break;}
      }
        while(
          somadados!=somadados2
        );

     }}}